import React from 'react';
import ReactDOM from 'react-dom';
import '../assets/stylesheets/app.scss';
import LodgementComponent from './lodgement/LodgementComponent';

/**
 * Called in GWT to start up root React component.
 */
window.startLodgement = () => {
    ReactDOM.render(<LodgementComponent/>, document.getElementById('app'));
};
