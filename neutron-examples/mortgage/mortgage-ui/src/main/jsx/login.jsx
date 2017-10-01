import React from 'react';
import ReactDOM from 'react-dom';
import {I18nextProvider} from 'react-i18next';
import i18n from './i18n';
import '../assets/stylesheets/login.scss';
import LoginService from './login/services/LoginService';
import LoginComponent from './login/LoginComponent';


const appContainerDomElement = document.getElementById('app');
/**
 * Called by GWT when GWT modules are loaded.
 */
window.createUI = () => {
    const model = LoginService.getLoginNode();
    ReactDOM.render(
        <I18nextProvider i18n={i18n}>
            <LoginComponent model={model}/>
        </I18nextProvider>,
        appContainerDomElement
    );
};
