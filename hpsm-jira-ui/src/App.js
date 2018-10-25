import React, { Component } from 'react';
import CustomRoutes from './routes/CustomRoutes';
import {Provider} from 'react-redux';
import store from './store';

class App extends Component {
    render() {
        return (
            <Provider store={store}>
              <CustomRoutes/>
            </Provider>
        );
    }
}

export default App;
