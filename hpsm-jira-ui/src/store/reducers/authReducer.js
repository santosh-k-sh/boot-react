import TRAVEL_TYPES from '../../components/AppConstants';

/* The reducer is a pure function that takes the previous state and an action, and returns the next state. (previousState, action) => newState.*/

const INITIAL_STATE = {
    hpsmUserName: '',
    problemsToMigrate: [],
    userAuthenticated: false
}

export const changeTravelTypeOfState = () => {
    return dispatch => {

        dispatch({
            type: TRAVEL_TYPES.TRAVEL_TYPE_ENTRY
        });
    }
}

export default (state = INITIAL_STATE, action) => {
    switch (action.type) {
        case TRAVEL_TYPES.CHANGE_USER_NAME:
            return ({
                ...state,
                hpsmUserName: action.payload
            })
        case TRAVEL_TYPES.UPDATE_COMPLETED_PROJECTS:
            return ({
                ...state,
                problemsToMigrate: action.payload
            })
        case TRAVEL_TYPES.USER_AUTHENTICATION:
            return ({
                ...state,
                userAuthenticated: action.payload
            })
        default:
            return state;
    }
}
