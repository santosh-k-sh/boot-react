import React, {Component} from 'react';
import {connect} from 'react-redux';
import { PageHeader } from 'react-bootstrap';
import axios from 'axios';

import {updateCompletedProblems} from '../actions/index';

class Process extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            problemsToMigrate: []
        };
    }

    componentDidMount() {
        axios.get('/processedProblems')
            .then(res => {
                this.setState({problemsToMigrate: res.data});
                this.props.updateProblemLists(this.state.problemsToMigrate);
            });
    }

    render() {
        return(
            <div className="container">

                <div className="row">
                    <div className="col-lg-12">
                        {this.props.userAuthenticated ?
                            (
                                <fragment>
                                    <PageHeader>Processed HPSM Problems</PageHeader>
                                    <table className="table table-striped table-bordered table-condensed table-hover">
                                        <thead>
                                        <th>Problem Id</th>
                                        <th>Description</th>
                                        <th>Assignee</th>
                                        <th>Title</th>
                                        </thead>
                                        <tbody>
                                        {this.props.problemsToMigrate.map(problem => (
                                            <tr>
                                                <td key={problem.problemNo}>{problem.problemNo}</td>
                                                <td key={problem.problemNo}>{problem.problemDescription}</td>
                                                <td key={problem.problemNo}>{problem.problemAssignee}</td>
                                                <td key={problem.problemNo}>{problem.problemTitle}</td>
                                            </tr>
                                        ))}
                                        </tbody>
                                    </table>
                                </fragment>
                            ) : ''
                        }
                    </div>
                </div>
            </div>
        )
    }
}

function mapStateToProps(state) {
    return {
        problemsToMigrate: state.authReducer.problemsToMigrate,
        userAuthenticated: state.authReducer.userAuthenticated
    }
}

function mapDispatchToProps(dispatch) {
    return({
        updateProblemLists: (problemList)=>{dispatch(updateCompletedProblems(problemList))}
    })
}

export default connect(mapStateToProps, mapDispatchToProps)(Process);

//export default Process;