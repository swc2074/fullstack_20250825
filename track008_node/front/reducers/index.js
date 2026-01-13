/**
 * reducers/index.js
 * ---------------------------------------------
 *✅ 루트 리듀서(rootREducer) 설정파일
 * - 여러 개의 리듀서를 하나로 합쳐 Redux 스토어에 전달
 * - 현재는 user리듀서만 포함
 */

 import { combineReducers } from "redux"; //여러 개의 리듀서를 하나로 합쳐 Redux 함수
 import user from './user';  // 사용자 관련 상태를 관리하는 user 리듀서
 //import user from './post';  // 사용자 관련 상태를 관리하는 user 리듀서

 const rootREducer = combineReducers({
    user, // post
 });
 export default rootREducer;