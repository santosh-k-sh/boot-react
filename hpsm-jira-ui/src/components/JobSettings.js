import React, { Component } from 'react';
import {
  Panel,
  Button,
  Col,
  PageHeader,
  ControlLabel,
  FormControl,
  HelpBlock,
  FormGroup,
  Checkbox,
  Form,
  Radio,
  InputGroup,
  Glyphicon } from 'react-bootstrap';

import FormControlFeedback from 'react-bootstrap/lib/FormControlFeedback';
import FormControlStatic from 'react-bootstrap/lib/FormControlStatic';
import InputGroupAddon from 'react-bootstrap/lib/InputGroupAddon';


import axios from 'axios';
import Loader from 'react-loader';
import {connect} from 'react-redux';
import {updateCompletedProblems} from '../actions/index';


class JobSettings extends Component {
    constructor(props, context) {
        super(props, context);

        this.handleChange = this.handleChange.bind(this);


        this.state = {
            hpsmForm: '',
            hpsmURL: 'http://10.4.50.192:13083/SM/7',
            hpsmUserName: '',
            hpsmUserPassword: '',
            hpsmUserAuthenticated: false,
            jiraURL: 'https://emaratech.atlassian.net',
            jiraUserName: '',
            jiraPassword: '',
            jiraUserAuthenticated: false,
            username: '',
            persons: [],
            hpsmUserObj: [],
            selectedTeam: "",
            validationError: "",
            jiraLoader: true,
            userAuthenticated: false,


            hpsmBusinessServices: [],
            jiraProjects: [],
            selectedHPSMProjectId: '',
            selectedJIRAProjectId: '',
            selectedProjectIndexToRemove: '',
            configLoader: true,
            selectedJobFrequency: '',
            scheduledType: '',


            selectedHpsmJiraProjectMappings: [],
            problemsToMigrate: []
        };
    }

    componentDidMount() {
        axios.get('/hpsmProjects')
        .then(res => {
            this.setState( {hpsmBusinessServices: res.data});
        });

        axios.get('/jiraProjects')
        .then(res => {
            this.setState( {jiraProjects: res.data});
        });

    }


    handleChange(e) {
      e.preventDefault();
      this.setState({
          [e.target.name]: e.target.value
      });

      console.log("Fields : " + this.state.hpsmUserName)
    }

    addBusinessServiceMappings = ()  => {
        axios.get('/addBusinessMappings/?selectedHPSMProjectName='+this.state.selectedHPSMProjectId+'&selectedJIRAProjectName='+this.state.selectedJIRAProjectId)
        .then(response => {
            this.setState({selectedHpsmJiraProjectMappings: response.data});
        });
    };

    removeBusinessServiceMappings = ()  => {
        axios.post('/removeBusinessMappings/?selectedProjectIndexToRemove='+this.state.selectedProjectIndexToRemove)
        .then(response => {
            this.setState({selectedHpsmJiraProjectMappings: response.data});
        });
    };

    saveConfiguration = ()  => {
        axios.get('/saveConfiguration')
            .then(response => {
            //this.setState({selectedHpsmJiraProjectMappings: response.data});
        });
    };

    loadHPSMProblems = (e)  => {
        e.preventDefault();
        this.setState({configLoader: false});
        axios.get('/loadHPSMProblems/?selectedJobFrequency='+this.state.selectedJobFrequency+'&scheduledType='+this.state.scheduledType)
            .then(response => {
                console.log('response returned...' + response.data);
                this.setState({problemsToMigrate: response.data, configLoader: true});
                this.props.updateProblemLists(this.state.problemsToMigrate);
        });
    };

    updateSchedule = (e)  => {
        e.preventDefault();
        this.setState({configLoader: false});
        axios.get('/updateSchedule/?selectedJobFrequency='+this.state.selectedJobFrequency+'&scheduledType='+this.state.scheduledType)
            .then(response => {
                console.log('response returned...' + response.data);
                this.setState({problemsToMigrate: response.data, configLoader: true});
                this.props.updateProblemLists(this.state.problemsToMigrate);
            });
    };

    render() {
        return(
            <div>

              <hr/>
              <div className="row">
                  <div className="col-lg-6">
                      <FormGroup controlid="hpsmServiceTypeId">
                          <ControlLabel>HPSM Services Type</ControlLabel>
                          <FormControl componentClass="select" placeholder="select">
                              <option value="1">Problem</option>
                              <option value="2">Change Request</option>
                          </FormControl>
                      </FormGroup>
                  </div>
                  <div className="col-lg-6">
                      <FormGroup controlid="jiraTypeId">
                          <ControlLabel>JIRA Type</ControlLabel>
                          <FormControl componentClass="select" placeholder="select">
                              <option value="1">Problem</option>
                              <option value="2">Story</option>
                          </FormControl>
                      </FormGroup>
                  </div>
              </div>

              <div className="row">
                  <div className="col-lg-6">
                      <FormGroup controlid="hpsmProjectId">
                          <ControlLabel>HPSM Business Services</ControlLabel>
                          <FormControl componentClass="select" multiple placeholder="select"
                               onChange={(e) => this.setState({selectedHPSMProjectId: e.target.value})}>
                              {
                                  this.state.hpsmBusinessServices.map(function(hpsmProject) {
                                      return <option key={hpsmProject.projectId}
                                                     value={hpsmProject.projectName}>{hpsmProject.projectName}</option>;
                                  })
                              }
                          </FormControl>
                      </FormGroup>
                  </div>
                  <div className="col-lg-6">
                      <FormGroup controlid="selectedJIRAProjectId">
                          <ControlLabel>JIRA Projects</ControlLabel>
                          <FormControl componentClass="select" multiple placeholder="select"
                               onChange={(e) => this.setState({selectedJIRAProjectId: e.target.value})}>
                              {
                                  this.state.jiraProjects.map(function(jiraProject) {
                                      return <option key={jiraProject.projectId - jiraProject.projectName}
                                                     value={jiraProject.projectId}>{jiraProject.projectName}</option>;
                                  })
                              }
                          </FormControl>
                      </FormGroup>
                  </div>
              </div>

              <div className="row">
                  <div className="col-md-2 col-md-offset-5">
                      <FormGroup controlid="formControlsDisabledButton">
                          <Button type="submit" onClick={e => this.addBusinessServiceMappings(e)} >Add</Button>
                          <Button type="submit" onClick={e => this.removeBusinessServiceMappings(e)}>Remove</Button>
                      </FormGroup>
                  </div>
              </div>

              <div className="row">
                  {/*<div className="col-md-2 col-md-offset-5">*/}
                      <FormControl componentClass="select" multiple placeholder="select"
                      onChange={ (e) => this.setState({selectedProjectIndexToRemove: e.target.selectedIndex})}>
                          {
                              this.state.selectedHpsmJiraProjectMappings.map(function(selectedProject) {
                                  return <option key={selectedProject.projectName}
                                                 value={selectedProject.projectId}>{selectedProject.projectName}</option>;
                              })
                          }
                      </FormControl>
                  {/*</div>*/}
              </div>

                <div className="row" style={{marginTop : '15px'}}>
                    <FormGroup>
                        <ControlLabel>Schedule Type</ControlLabel>
                        <Radio name="radioGroup" inline onChange={ e => this.setState({scheduledType: e.target.value})} value="H" style={{paddingLeft: '30px'}}>Hourly</Radio>
                        <Radio name="radioGroup" inline onChange={ e => this.setState({scheduledType: e.target.value})} value="M">Minute</Radio>
                    </FormGroup>

                    { this.state.scheduledType === 'M' ?
                        <FormGroup>
                            <InputGroup>
                                <InputGroup.Addon>Schedule Type</InputGroup.Addon>
                                <FormControl type="text" placeholder="Minute" style={{width: '130px'}} onChange={ e => this.setState({selectedJobFrequency: e.target.value})} />
                            </InputGroup>
                        </FormGroup>
                        :
                        this.state.scheduledType === 'H' ?
                            <FormGroup>
                                <InputGroup>
                                    <InputGroup.Addon>Schedule Type</InputGroup.Addon>
                                    <FormControl type="text" placeholder="Hourly" style={{width: '130px'}} onChange={ e => this.setState({selectedJobFrequency: e.target.value})} />
                                </InputGroup>
                            </FormGroup> : null
                    }

                    <FormGroup controlid="saveConfiguration">
                        <Button type="submit" bsStyle="primary" onClick={e => this.loadHPSMProblems(e)}>Start</Button>
                        <Button type="submit" bsStyle="info" onClick={e => this.updateSchedule(e)} style={{marginLeft:'5px'}}>Update Schedule</Button>
                    </FormGroup>
                </div>
                <Loader loaded={this.state.configLoader}/>

            </div> /* Main Div */
        )
    }
}

function mapStateToProps(state) {
    return { hpsmUserName: state.authReducer.hpsmUserName }
}

function mapDispatchToProps(dispatch) {
    return({
        updateProblemLists: (problemList)=>{dispatch(updateCompletedProblems(problemList))}
    })
}

export default connect(mapStateToProps, mapDispatchToProps)(JobSettings);