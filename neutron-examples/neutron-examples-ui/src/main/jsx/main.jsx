import React from 'react';
import ReactDOM from 'react-dom';
import '../assets/stylesheets/app.scss';
import LodgementComponent from './lodgement/LodgementComponent';
import EventService from './neutron/EventService';


const appContainerDomElement = document.getElementById('app');
appContainerDomElement.addEventListener('click', (e) => {
    EventService.fire('root_click', e.target);
});
appContainerDomElement.addEventListener('keyup', (e) => {
    EventService.fire('root_keyup', e.target);
});

let appRendered = false;

/**
 * Called in GWT to start up root React component.
 */
window.startLodgement = () => {
    if (appRendered)
        return;
    ReactDOM.render(<LodgementComponent/>, appContainerDomElement);
    appRendered = true;
};
