import rootReducer from './reducers';
import {createStore, applyMiddleware} from 'redux';
import thunk from 'redux-thunk';
import { reducer as reduxFormReducer } from 'redux-form';


const store = createStore(
    rootReducer,
    {},
    applyMiddleware(thunk)
);

export default store;
