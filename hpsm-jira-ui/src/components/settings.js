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

import {connect} from 'react-redux';
import {doChangeHPSMUserName, updateUserAuthentication} from '../actions/index';

import JobSettings from '../components/JobSettings';


import axios from 'axios';
import Loader from 'react-loader';
import Notifications, {notify} from 'react-notify-toast';

class Setting extends Component {
    constructor(props, context) {
        super(props, context);

        this.handleChange = this.handleChange.bind(this);
        /*this.handleNameChange = this.handleNameChange.bind(this);*/

        this.state = {
            hpsmForm: '',
            hpsmURL: 'http://10.4.50.192:13083/SM/7',
            hpsmUserName: '',
            hpsmUserPassword: '',
            hpsmUserAuthenticated: false,
            hpsmLoginBtnClicked: false,
            jiraURL: 'https://emaratech.atlassian.net',
            jiraUserName: '',
            jiraPassword: '',
            jiraUserAuthenticated: false,
            jiraLoginBtnClicked: false,
            username: '',
            persons: [],
            hpsmUserObj: [],
            selectedTeam: "",
            validationError: "",
            hpsmLoader: true,
            jiraLoader: true,
            userAuthenticated: false
        };
    }

    handleChange(e) {
      e.preventDefault();
      this.setState({
          [e.target.name]: e.target.value
      });

      console.log("Fields : " + this.state.hpsmUserName)
    }

    /*handleNameChange(e) {
        e.preventDefault();
        this.props.changeHPSMUserName(e);
    }*/

    doHPSMLogin = (e) => {
      e.preventDefault();
      console.log(this.state);

      this.setState( {hpsmLoader: false})

      const user = {
        name: this.state.hpsmUserName
      };

       // Passing req param directly -- axios.post('http://localhost:8080/sum/?hpsmUrl='+this.state.hpsmURL+'&hpsmUserName='+this.state.hpsmUserName+'&hpsmPassword='+this.state.hpsmUserPassword)
        // another method to pass data
        axios.post('/validatehpsm',
            {
                'hpsmUrl': this.state.hpsmURL,
                'hpsmUserName': this.state.hpsmUserName,
                'hpsmPassword': this.state.hpsmUserPassword
            }).then(response => {
                this.setState( {hpsmUserAuthenticated: response.data, hpsmLoader:true, hpsmLoginBtnClicked:true});
                if(this.state.hpsmUserAuthenticated) {
                    notify.show('Login verified !', 'success');
                } else {
                    notify.show('Login failed !', 'error');
                }
                if(this.state.hpsmUserAuthenticated && this.state.jiraUserAuthenticated) {
                    this.setState({userAuthenticated:true});
                }
            this.props.changeHPSMUserName(this.state.hpsmUserName);
          }).catch(error => {
              notify.show(error);
      });

    }

    doJIRALogin = (e) => {
        e.preventDefault();
        this.setState( {jiraLoader: false});

        axios.post('/authenticatejira',
            {
                'jiraURL': this.state.jiraURL,
                'jiraUserName': this.state.jiraUserName,
                'jiraPassword': this.state.jiraPassword
            }).then(response => {
            this.setState( {jiraUserAuthenticated: response.data, jiraLoader:true, jiraLoginBtnClicked:true});
            if(this.state.jiraUserAuthenticated) {
                notify.show('Login verified !', 'success');
            } else {
                notify.show('Login failed !', 'error');
                this.props.updateUserAuthentication(false);
            }
            if(this.state.hpsmUserAuthenticated && this.state.jiraUserAuthenticated) {
                this.setState({userAuthenticated:true});
                this.props.updateUserAuthentication(true);

            }
            console.log(response.data);
        }).catch(error => {
            notify.show(error);
        });

    }

    loadData = (e)  => {
      e.preventDefault();
        axios.get('https://jsonplaceholder.typicode.com/users')
            .then(res => {
                console.log(res);
                console.log(res.data);
                this.setState( {persons: res.data});
            });
    }

    handlePersonChange = event => {
      this.setState( {username: event.target.value} );
    }

    render() {
        return(
            <div className="container">
                <Notifications />
              <div className="row">
                <div className="col-lg-12">
                  <PageHeader>Configure</PageHeader>
                </div>
              </div>

              <div className="row">
                <div className="col-lg-12">

                  <Panel>
                    <div className="row">
                      <div className="col-lg-6">

                        <Form>
                          <Panel bsStyle="primary">
                            <Panel.Heading>
                              <Panel.Title componentClass="h2">HPSM Login</Panel.Title>
                            </Panel.Heading>
                            <Panel.Body>
                              <FormGroup controlid="hpsmURLId">
                                <ControlLabel>URL</ControlLabel>
                                <FormControl type="text" name="hpsmURL" value={this.state.hpsmURL}
                                       onChange={ e => this.handleChange(e)} />
                                <FormControlFeedback />
                                <HelpBlock>HPSM server URL</HelpBlock>
                              </FormGroup>

                              <FormGroup controlid="hpsmUserNameId">
                                <ControlLabel>User Name</ControlLabel>
                                  <FormControl bsClass={this.state.hpsmUserAuthenticated ? 'form-control': this.state.hpsmLoginBtnClicked ? 'form-control danger': 'form-control'}
                                    name="hpsmUserName"
                                    type="text"
                                    placeholder="User Name"
                                    onChange={ e => this.handleChange(e)}
                                />
                                <FormControlFeedback />
                              </FormGroup>

                              <FormGroup controlid="hpsmPasswordId">
                                <ControlLabel>Password</ControlLabel>
                                <FormControl bsClass={this.state.hpsmUserAuthenticated ? 'form-control': this.state.hpsmLoginBtnClicked ? 'form-control danger': 'form-control'}
                                    name="hpsmUserPassword"
                                    type="password"
                                    placeholder="Password" required
                                    onChange={ e => this.handleChange(e)}
                                />
                                <FormControlFeedback />
                              </FormGroup>

                              {/*<select className="form-control" value={this.state.selectedTeam}
                                      onChange={(e) => this.setState({selectedTeam: e.target.value, validationError: e.target.value === "" ? "You must select your favourite team" : ""})}>>
                                <option value="" >Select One</option>
                                  {
                                      this.state.persons.map(function(user) {
                                          return <option key={user._id}
                                                         value={user.name}>{user.name}</option>;
                                      })
                                  }
                              </select>*/}

                              <div style={{color: 'red', marginTop: '5px'}}>
                                  {this.state.validationError}
                              </div>

                              <FormGroup controlid="formControlButtonHPSMLogin">
                                <Button bsStyle="primary" type="submit" onClick={e => this.doHPSMLogin(e)} >Sign In</Button>
                              </FormGroup>

                              <div>
                                  <Loader loaded={this.state.hpsmLoader}/>
                              </div>

                            </Panel.Body>
                          </Panel>
                        </Form>
                      </div>

                      <div className="col-lg-6">
                        <Form>
                          <Panel bsStyle="primary">
                            <Panel.Heading>
                              <Panel.Title componentClass="h3">JIRA Login</Panel.Title>
                            </Panel.Heading>
                            <Panel.Body>
                              <FormGroup controlid="jiraURLId">
                                <ControlLabel>URL</ControlLabel>
                                <FormControl type="text" name="jiraURL" value="https://emaratech.atlassian.net"/>
                                <FormControlFeedback />
                                <HelpBlock>JIRA server URL</HelpBlock>
                              </FormGroup>

                              <FormGroup controlid="jiraUserId">
                                <ControlLabel>User Name</ControlLabel>
                                  <FormControl bsClass={this.state.jiraUserAuthenticated ? 'form-control': this.state.jiraLoginBtnClicked ? 'form-control danger': 'form-control'}
                                    controlid="jiraUserNameId"
                                    type="text"
                                    name="jiraUserName"
                                    placeholder="User Name"
                                    onChange={this.handleChange}
                                />
                                <FormControlFeedback />
                              </FormGroup>

                              <FormGroup controlid="jiraPasswordId">
                                <ControlLabel>Password</ControlLabel>
                                  <FormControl bsClass={this.state.jiraUserAuthenticated ? 'form-control': this.state.jiraLoginBtnClicked ? 'form-control danger': 'form-control'}
                                    type="password"
                                    name="jiraPassword"
                                    placeholder="Password"
                                    onChange={this.handleChange}
                                />
                                <FormControlFeedback />
                              </FormGroup>

                              <FormGroup controlid="formControlButtonJiraLogin">
                                  <Button bsStyle="primary" type="submit" onClick={e => this.doJIRALogin(e)}>Sign In</Button>
                              </FormGroup>

                              <div>
                                  <Loader loaded={this.state.jiraLoader}/>
                                      {/*<b>{this.state.jiraUserAuthenticated ? 'Login Success' : 'Login Failed'}</b>
                                  </Loader>*/}
                              </div>

                            </Panel.Body>
                          </Panel>
                        </Form>

                      </div>
                    </div>
                  </Panel>

                </div>
              </div>

              <div className="row">
                  <div className="col-lg-12">
                      <b>{this.props.userAuthenticated ? <JobSettings/> : ''}</b>
                  </div>
              </div>

                 {/* to be removed*/}
            </div> /* Main Div */
        )
    }
}

function mapStateToProps(state) {
    return {
        hpsmUserName: state.authReducer.hpsmUserName,
        userAuthenticated: state.authReducer.userAuthenticated
    }
}

function mapDispatchToProps(dispatch) {
    return({
        changeHPSMUserName: (userName)=>{dispatch(doChangeHPSMUserName(userName))},
        updateUserAuthentication: (flag) => {dispatch(updateUserAuthentication(flag))}
    })
}

export default connect(mapStateToProps, mapDispatchToProps)(Setting);

