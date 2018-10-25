import React, {Component} from 'react';
import {connect} from 'react-redux';
import { PageHeader } from 'react-bootstrap';

class Process extends Component {
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
        hpsmUserName: state.authReducer.hpsmUserName,
        problemsToMigrate: state.authReducer.problemsToMigrate,
        userAuthenticated: state.authReducer.userAuthenticated
    }
}

export default connect(mapStateToProps, null)(Process);

//export default Process;