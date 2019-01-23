package com.emaratech.hpsmjira.utility;

import com.emaratech.hpsmjira.model.HPSMProject;
import com.emaratech.hpsmjira.model.JIRAProject;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Santosh.Sharma on 9/29/2018.
 */

@Component
public class LookupProvider {
    public static final String TVIS = "TVIS";
    public static final String TARA = "TARA";
    public static final String TEAP = "TEAP";
    public static final String TEDNRD = "TEDNRD";
    public static final String TEFRM = "TEFRM";
    public static final String TGATES = "TGATES";
    public static final String TIQC = "TIQC";
    public static final String TMBL = "TMBL";
    public static final String TNGE = "TNGE";
    public static final String TNOQ = "TNOQ";
    public static final String TNOQRL = "TNOQRL";
    public static final String TUXD = "TUXD";
    public static final String VFIS = "VFIS";
    public static final String SMART_CHANNEL = "SC";

    private List<JIRAProject> jiraProjects;
    private List<HPSMProject> hpsmProjects;

    @PostConstruct
    public void load() {
        jiraProjects = loadJIRAProjects();
        hpsmProjects = loadHPSMProjects();
    }

    public List<JIRAProject> loadJIRAProjects() {
        Map<String, List<JIRAProject>> jiraProjectMap = new HashMap<String, List<JIRAProject>>();
        List<JIRAProject> jiraProjects = new ArrayList<JIRAProject>();

        List<JIRAProject> tvisProjects = new ArrayList<JIRAProject>();
        tvisProjects.add(new JIRAProject(TVIS, "Vision"));
        jiraProjectMap.put(TVIS, tvisProjects);

        List<JIRAProject> visProjects = new ArrayList<JIRAProject>();
        visProjects.add(new JIRAProject(VFIS, "FIS"));
        jiraProjectMap.put(VFIS, visProjects);

        List<JIRAProject> araProjects = new ArrayList<JIRAProject>();
        araProjects.add(new JIRAProject(TARA, "ARA"));
        jiraProjectMap.put(TARA, araProjects);

        List<JIRAProject> tgatesProjects = new ArrayList<JIRAProject>();
        tgatesProjects.add(new JIRAProject(TGATES, "Gates"));
        jiraProjectMap.put(TGATES, tgatesProjects);

        List<JIRAProject> tdnrdProjects = new ArrayList<JIRAProject>();
        tdnrdProjects.add(new JIRAProject(TEDNRD, "eDNRD"));
        jiraProjectMap.put(TEDNRD, tdnrdProjects);

        List<JIRAProject> teformProjects = new ArrayList<JIRAProject>();
        teformProjects.add(new JIRAProject(TEFRM, "eForms"));
        jiraProjectMap.put(TEFRM, teformProjects);

        List<JIRAProject> tmblProjects = new ArrayList<JIRAProject>();
        tmblProjects.add(new JIRAProject(TMBL, "Mobile"));
        jiraProjectMap.put(TMBL, tmblProjects);

        List<JIRAProject> tnoqProjects = new ArrayList<JIRAProject>();
        tnoqProjects.add(new JIRAProject(TNOQ, "Noqodi (Legacy)"));
        jiraProjectMap.put(TNOQ, tnoqProjects);

        List<JIRAProject> tnoqRevamp = new ArrayList<JIRAProject>();
        visProjects.add(new JIRAProject(TNOQRL, "Noqodi (Revamp)"));
        jiraProjectMap.put(TNOQRL, tnoqRevamp);

        List<JIRAProject> teapProjects = new ArrayList<JIRAProject>();
        teapProjects.add(new JIRAProject(TEAP, "EAP"));
        jiraProjectMap.put(TEAP, teapProjects);

        List<JIRAProject> tiqcProjects = new ArrayList<JIRAProject>();
        tiqcProjects.add(new JIRAProject(TIQC, "IQC"));
        jiraProjectMap.put(TIQC, tiqcProjects);

        List<JIRAProject> tngeProjects = new ArrayList<JIRAProject>();
        tngeProjects.add(new JIRAProject(TNGE, "NGE"));
        jiraProjectMap.put(TNGE, tngeProjects);

        List<JIRAProject> smartChannelProjects = new ArrayList<JIRAProject>();
        smartChannelProjects.add(new JIRAProject(SMART_CHANNEL, "Smart Channel"));
        jiraProjectMap.put(SMART_CHANNEL, smartChannelProjects);

        for(Map.Entry<String, List<JIRAProject>> projectEntrySet : jiraProjectMap.entrySet()) {
            jiraProjects.addAll(projectEntrySet.getValue());
        }

        return jiraProjects;
    }

    public List<HPSMProject> loadHPSMProjects() {
        Map<String, List<HPSMProject>> hpsmProjectMap = new HashMap<String, List<HPSMProject>>();
        List<HPSMProject>  hpsmProjects = new ArrayList<HPSMProject>();

        List<HPSMProject> tvisProjects = new ArrayList<HPSMProject>();
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Core"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.BorderControl"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.BCLite"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Core.Establishment"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Core.Integrations"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Core.NSD"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Eborder"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.FIS.OverCounter"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.iLog"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Seaport"));
        tvisProjects.add(new HPSMProject(TVIS, "Vision.Seaport.BorderControl"));
        hpsmProjectMap.put(TVIS, tvisProjects);

        List<HPSMProject> taraProjects = new ArrayList<HPSMProject>();
        taraProjects.add(new HPSMProject("ARA", "ARA"));
        hpsmProjectMap.put(TARA, taraProjects);

        List<HPSMProject> teapProjects = new ArrayList<HPSMProject>();
        teapProjects.add(new HPSMProject(TEAP, "Unified Channel"));
        hpsmProjectMap.put(TEAP, teapProjects);

        List<HPSMProject> tednrdProjects = new ArrayList<HPSMProject>();
        tednrdProjects.add(new HPSMProject(TEDNRD, "LegacyeDNRD"));
        tednrdProjects.add(new HPSMProject(TEDNRD, "VisioneDNRD"));
        tednrdProjects.add(new HPSMProject(TEDNRD, "VisioneDNRD.Portal"));
        tednrdProjects.add(new HPSMProject(TEDNRD, "VisioneDNRD.Portal.ETA"));
        hpsmProjectMap.put(TEDNRD, tednrdProjects);

        List<HPSMProject> tefrmProjects = new ArrayList<HPSMProject>();
        tefrmProjects.add(new HPSMProject(TEFRM, "LegacyeForm"));
        tefrmProjects.add(new HPSMProject(TEFRM, "LegacyeForm.Portal"));
        tefrmProjects.add(new HPSMProject(TEFRM, "VisioneForm"));
        tefrmProjects.add(new HPSMProject(TEFRM, "VisioneForm.ChannelPartners.Registration"));
        hpsmProjectMap.put(TEFRM, tefrmProjects);

        List<HPSMProject> tgatesProjects = new ArrayList<HPSMProject>();
        tgatesProjects.add(new HPSMProject(TGATES, "ADP-IRIS-Check"));
        tgatesProjects.add(new HPSMProject(TGATES, "eGate"));
        tgatesProjects.add(new HPSMProject(TGATES, "MOI.EtihadGates"));
        tgatesProjects.add(new HPSMProject(TGATES, "Vision.EKGates"));
        tgatesProjects.add(new HPSMProject(TGATES, "Vision.FDGate"));
        tgatesProjects.add(new HPSMProject(TGATES, "Vision.NextGenerationSmartGates"));
        tgatesProjects.add(new HPSMProject(TGATES, "Vision.SmartGate"));
        tgatesProjects.add(new HPSMProject(TGATES, "Vision.SmartCorridor"));
        hpsmProjectMap.put(TGATES, tgatesProjects);

        List<HPSMProject> tiqcProjects = new ArrayList<HPSMProject>();
        tiqcProjects.add(new HPSMProject(TIQC, "Vision.IQC"));
        hpsmProjectMap.put(TIQC, tiqcProjects);

        List<HPSMProject> tmblProjects = new ArrayList<HPSMProject>();
        tmblProjects.add(new HPSMProject(TMBL, "Mobility"));
        hpsmProjectMap.put(TMBL, tmblProjects);

        List<HPSMProject> tngeProjects = new ArrayList<HPSMProject>();
        tngeProjects.add(new HPSMProject(TNGE, "Vision.NGE"));
        hpsmProjectMap.put(TNGE, tngeProjects);

        List<HPSMProject> tnoqProjects = new ArrayList<HPSMProject>();
        tnoqProjects.add(new HPSMProject(TNOQ, "Noqodi"));
        tnoqProjects.add(new HPSMProject(TNOQ, "Noqodi.Merchants"));
        tnoqProjects.add(new HPSMProject(TNOQ, "Noqodi.Payment"));
        tnoqProjects.add(new HPSMProject(TNOQ, "Noqodi.Reports"));
        hpsmProjectMap.put(TNOQ, tnoqProjects);

        List<HPSMProject> tuxdProjects = new ArrayList<HPSMProject>();
        tuxdProjects.add(new HPSMProject(TUXD, "Noqodi.FrontOffice"));
        hpsmProjectMap.put(TUXD, tuxdProjects);

        List<HPSMProject> vfisProjects = new ArrayList<HPSMProject>();
        vfisProjects.add(new HPSMProject(VFIS, "FIS.Backend"));
        hpsmProjectMap.put(VFIS, vfisProjects);

        List<HPSMProject> smartChannelProjects = new ArrayList<HPSMProject>();
        smartChannelProjects.add(new HPSMProject(SMART_CHANNEL, "Smart Channels"));
        hpsmProjectMap.put(SMART_CHANNEL, smartChannelProjects);

        for(Map.Entry<String, List<HPSMProject>> projectEntrySet : hpsmProjectMap.entrySet()) {
            hpsmProjects.addAll(projectEntrySet.getValue());
        }

        return hpsmProjects;
    }

    public List<JIRAProject> getJiraProjects() {
        return jiraProjects;
    }

    public void setJiraProjects(List<JIRAProject> jiraProjects) {
        this.jiraProjects = jiraProjects;
    }

    public List<HPSMProject> getHpsmProjects() {
        return hpsmProjects;
    }

    public void setHpsmProjects(List<HPSMProject> hpsmProjects) {
        this.hpsmProjects = hpsmProjects;
    }
}
