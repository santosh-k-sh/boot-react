import React, {Component} from 'react';
import {Router, Route} from 'react-router-dom';
import Navbar from '../components/Navbar';
import history from './history';

import menuItems from '../components/Menu';

class CustomRoutes extends Component {
    render() {
        return (
            <Router history={history}>

                <div id="page-wrapper" className="page-wrapper">
                    <Navbar/>

                    {/* Losding components from menu to route the links */}
                    {menuItems.map(menuItem => (
                        <Route exact path={menuItem.menuURL} component={menuItem.componentToRender} />
                    ))}

                    {/* <Route exact path='/' component={HomePage} /> */}
                    {/* <Route exact path='/form' component={newForm} /> */}
                    {/* <Route exact path='/git' component={About} /> */}
                    {/* <Route exact path='/about' component={About} /> */}

                    
                </div>
            </Router>
        )
    }
}


export default CustomRoutes;