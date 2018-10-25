import React, {Component} from 'react';
import logo from '../hp-emt-jira.png';

import { Chart } from "react-google-charts";


class Home extends Component {
    render() {
        return(
            <div style={{padding: '10px' }}>
                <img className="github" src={logo} width="200" alt="github" style={{marginTop: '8px'}}/>


                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div>
                        <div>
                            <div>
                                <div>
                                    <h2>HPSM Problem intergations</h2>
                                    <ul class="nav navbar-right panel_toolbox"></ul>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <div>

                                        {/*<Chart
                                            height={'600px'}
                                            chartType="AreaChart"
                                            loader={<div>Loading Chart</div>}
                                            data={[
                                                ['Year', 'Sales', 'Expenses'],
                                                ['2013', 1000, 400],
                                                ['2014', 1170, 460],
                                                ['2015', 660, 1120],
                                                ['2016', 1030, 540],
                                            ]}
                                            options={{
                                                title: 'Company Performance',
                                                hAxis: { title: 'Year', titleTextStyle: { color: '#333' } },
                                                vAxis: { minValue: 0 },
                                                // For the legend to fit, we make the chart area smaller
                                                chartArea: { width: '50%', height: '70%' },
                                                // lineWidth: 25
                                            }}
                                        />*/}


                                        {/*<Chart
                                            chartType="ScatterChart"
                                            data={[["Problem", "Change Request"], [4, 5.5], [19, 5.6]]}
                                            width="100%"
                                            height="400px"
                                            legendToggle
                                        />*/}

                                        <Chart height={'600px'}
                                            chartType="ColumnChart"
                                            loader={<div>Loading Chart</div>}
                                            data={[
                                                ['City', 'Problems', 'Change Request'],
                                                ['Vision.BorderControl', 80, 12],
                                                ['Vision.Core', 20, 15],
                                                ['eDNRD', 70, 25],
                                                ['FIS', 12, 3],
                                                ['eForm', 16, 4],
                                            ]}
                                            options={{
                                                title: 'HPSM Items Integrated',
                                                chartArea: { width: '30%' },
                                                hAxis: {
                                                    title: 'Months',
                                                    minValue: 0,
                                                },
                                                vAxis: {
                                                    title: 'Counts',
                                                },
                                            }}
                                            legendToggle
                                        />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        )
    }
}

export default Home;