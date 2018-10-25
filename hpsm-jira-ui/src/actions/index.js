/**
 * Created by Santosh.Sharma on 10/20/2018.
 */
import axios from 'axios';
import Notifications, {notify} from 'react-notify-toast';
import TRAVEL_TYPES from '../components/AppConstants';

export function doHPSMLogin1(e) {


}

export function doChangeHPSMUserName(e) {
    return dispatch => {
        dispatch({ type: TRAVEL_TYPES.CHANGE_USER_NAME, payload: e })
    }
}

export function updateCompletedProblems(problemList) {
    return dispatch => {
        dispatch({ type: TRAVEL_TYPES.UPDATE_COMPLETED_PROJECTS, payload: problemList })
    }
}

export function updateUserAuthentication(flag) {
    return dispatch => {
        dispatch({ type: TRAVEL_TYPES.USER_AUTHENTICATION, payload: flag })
    }
}