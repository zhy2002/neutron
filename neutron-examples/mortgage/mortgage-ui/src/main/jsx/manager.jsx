import React from 'react';
import ReactDOM from 'react-dom';
import {I18nextProvider} from 'react-i18next';
import i18n from './i18n';
import '../assets/stylesheets/manager.scss';
import LodgementComponent from './lodgement/LodgementComponent';
import LodgementService from './lodgement/services/LodgementService';
import EventService from './neutron/EventService';


//these events are used by some components to detect
//if a click or keyup event has occurred outside of them.
const appContainerDomElement = document.getElementById('app');
appContainerDomElement.addEventListener('click', (e) => {
    EventService.fire('root_click', e.target);
});
appContainerDomElement.addEventListener('keyup', (e) => {
    EventService.fire('root_keyup', e.target);
});

/**
 * Called by GWT when GWT modules are loaded.
 */
window.createUI = () => {
    const model = LodgementService.getGlobalUiStateNode();
    ReactDOM.render(
        <I18nextProvider i18n={i18n}>
            <LodgementComponent model={model}/>
        </I18nextProvider>,
        appContainerDomElement
    );

    const spinner = document.getElementById('initial-spinner');
    if (spinner) {
        spinner.style.display = 'none';
    }
};
