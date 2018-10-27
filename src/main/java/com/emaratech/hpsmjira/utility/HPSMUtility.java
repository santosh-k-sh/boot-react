package com.emaratech.hpsmjira.utility;

import com.emaratech.hp.schemas.sm._7.*;
import com.emaratech.hp.schemas.sm._7.common.DateTimeType;
import com.emaratech.hp.schemas.sm._7.common.StringType;
import com.emaratech.hpsmjira.model.HPSMProblem;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Santosh.Sharma on 9/26/2018.
 */
public class HPSMUtility {
    public static HPSMProblem loadProblemDetails(ProblemManagement problemManagement, String problemNo) {
        RetrieveProblemRequest retrieveProblemRequest = new RetrieveProblemRequest();
        ProblemModelType model = new ProblemModelType();
        ProblemKeysType key = new ProblemKeysType();

        JAXBElement<StringType> id = setProblemKeysTypeID(problemNo);
        key.setID(id);
        model.setKeys(key);

        ProblemInstanceType instanceType = new ProblemInstanceType();
        model.setInstance(instanceType);


        retrieveProblemRequest.setModel(model);
        RetrieveProblemResponse retrieveProblemResponse = problemManagement.retrieveProblem(retrieveProblemRequest);

        System.out.println(retrieveProblemResponse.getModel().getInstance().getDescription());
        ProblemInstanceType problemInstanceType = retrieveProblemResponse.getModel().getInstance();

        HPSMProblem hpsmProblem = prepareHPSMProblemData(problemInstanceType);

        String status = problemInstanceType.getStatus().getValue().getValue();
        System.out.println(status);

        return hpsmProblem;
    }

    private static HPSMProblem prepareHPSMProblemData(ProblemInstanceType problemInstanceType) {
        HPSMProblem hpsmProblem = new HPSMProblem();
        StringBuffer description = new StringBuffer();

        for(StringType descType : problemInstanceType.getDescription().getDescription()) {
            description.append(descType.getValue()+"\n");
        }

        StringBuffer problemId = new StringBuffer();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(problemInstanceType.getID().getValue().getValue());
        while (m.find()) {
            problemId.append(m.group());
        }
        hpsmProblem.setProblemId(Long.parseLong(problemId.toString()));
        hpsmProblem.setProblemNo(problemInstanceType.getID().getValue().getValue());
        hpsmProblem.setProblemDescription(description.toString());
        hpsmProblem.setProblemTitle(problemInstanceType.getTitle().getValue().getValue());
        hpsmProblem.setProblemStatus(problemInstanceType.getStatus().getValue().getValue());
        if(problemInstanceType.getAssignee() != null) {
            hpsmProblem.setProblemAssignee(problemInstanceType.getAssignee().getValue().getValue());
        }
        if(problemInstanceType.getPriority() != null) {
            hpsmProblem.setProblemPriority(problemInstanceType.getPriority().getValue().getValue());
        }
        if(problemInstanceType.getUrgency() != null) {
            hpsmProblem.setProblemUrgency(problemInstanceType.getUrgency().getValue().getValue());
        }
        if(problemInstanceType.getIncidentCount() != null) {
            hpsmProblem.setIncidentCount(String.valueOf(problemInstanceType.getIncidentCount().getValue().getValue()));
        }
        if(problemInstanceType.getImpact() != null) {
            hpsmProblem.setImpact(problemInstanceType.getImpact().getValue().getValue());
        }
        if(problemInstanceType.getSubCategory() != null) {
            hpsmProblem.setSubCategory(problemInstanceType.getSubCategory().getValue().getValue());
        }
        if(problemInstanceType.getProblemType() != null) {
            hpsmProblem.setProjectKey(problemInstanceType.getProblemType().getValue().getValue());
        }

        return hpsmProblem;
    }

    public static JAXBElement<StringType> setProblemKeysTypeID(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> problemKeysTypeID = factory.createProblemKeysTypeID(stringType);

        return problemKeysTypeID;
    }

    public static JAXBElement<StringType> setImpactValue(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> impact = factory.createProblemInstanceTypeImpact(stringType);

        return impact;
    }

    public static JAXBElement<StringType> setServiceValue(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> impact = factory.createProblemInstanceTypeService(stringType);

        return impact;
    }

    public static JAXBElement<StringType> setStatusValue(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> status = factory.createProblemInstanceTypeStatus(stringType);

        return status;
    }

    public static JAXBElement<DateTimeType> setOpenTime(Date openDate) {
        // The dateTime is specified in the following form "YYYY-MM-DDThh:mm:ss" where:
        XMLGregorianCalendar xmlGregorianCalendar = null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(openDate);

        Calendar calendar = Calendar.getInstance();
        gregorianCalendar.setTimeZone(calendar.getTimeZone());
        try {
            DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
            xmlGregorianCalendar = dataTypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        }
        catch (Exception e) {
            System.out.println("Exception in conversion of Date to XMLGregorianCalendar" + e);
        }

        /*String isoDateTime = "2017-12-06T17:39:00Z";
        XMLGregorianCalendar dateXMLGreg = null;
        try {
            dateXMLGreg = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(isoDateTime);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }*/

        ObjectFactory factory = new ObjectFactory();
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setValue(xmlGregorianCalendar);

        JAXBElement<DateTimeType> dateTimeTypeJAXBElement = factory.createProblemTaskInstanceTypeOpenTime(dateTimeType);

        return dateTimeTypeJAXBElement;
    }

    public static JAXBElement<StringType> setClosureCode(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> status = factory.createProblemInstanceTypeClosureCode(stringType);

        return status;
    }

    public static JAXBElement<StringType> setSubCategory(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> status = factory.createProblemInstanceTypeSubCategory(stringType);

        return status;
    }

    public static NEW9330035ProblemInstanceType.Solution createSolution() {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        return factory.createNEW9330035ProblemInstanceTypeSolution();
    }

    public static JAXBElement<StringType> setAssignee(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> status = factory.createNEW9330035ProblemInstanceTypeAssignee(stringType);

        return status;
    }

    public static JAXBElement<StringType> setAssignmentGroup(String value) {
        ObjectFactory factory = new ObjectFactory();
        StringType stringType = new StringType();
        stringType.setValue(value);
        JAXBElement<StringType> status = factory.createNEW9330035ProblemInstanceTypeAssignmentGroup(stringType);

        return status;
    }



}
