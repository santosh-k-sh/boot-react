import reducer from './reducer';
import authReducer from './authReducer';
import {combineReducers} from 'redux';
import { reducer as formReducer } from 'redux-form'

export default combineReducers({
    rootReducer: reducer,
    authReducer: authReducer,
    form: formReducer
});

