import StorageService from '../../lodgement/services/StorageService';
import StaticService from '../../neutron/StaticService';
import CommonUtil from '../../neutron/CommonUtil';

let loginNode = null;

function setCookie(cname, cvalue, exdays) {
    const d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    const expires = `expires=${d.toUTCString()}`;
    document.cookie = `${cname}=${cvalue};${expires};path=/`;
}

function getParameterByName(key) {
    const url = window.location.href;
    const name = key.replace(/[[\]]/g, '\\$&');
    const regex = new RegExp(`[?&]${name}(=([^&#]*)|&|#|$)`);
    const results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, ' '));
}

function createLoginNode() {
    return window.GWT.LoginNodeFactory.create();
}

export default class LoginService extends StaticService {
    static getLoginNode() {
        if (loginNode === null) {
            loginNode = createLoginNode();
            CommonUtil.enhanceContext(loginNode.getContext());
            console.debug('loaded login node');
        }
        return loginNode;
    }

    static login(username, password) {
        return StorageService.getUser(username).then((user) => {
            if (!user || user.password !== password)
                return Promise.reject('not match');
            delete user.password;
            setCookie('userInfo', JSON.stringify(user), 1);
            let url = getParameterByName('return');
            if (!url) {
                url = 'index.html';
            }
            window.location.href = url;
            return username;
        });
    }
}
