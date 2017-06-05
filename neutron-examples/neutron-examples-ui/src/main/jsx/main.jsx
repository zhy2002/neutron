import React from 'react';
import ReactDOM from 'react-dom';
import '../assets/stylesheets/app.scss';
import FormManagerComponent from './lodgement/FormManagerComponent';
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
window.startLodgement = () => {
    ReactDOM.render(<FormManagerComponent/>, appContainerDomElement);
};
