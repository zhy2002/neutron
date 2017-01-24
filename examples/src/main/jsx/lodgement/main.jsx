import React from 'react';
import ReactDOM from 'react-dom';
import LodgementComponent from './LodgementComponent';


function createApp() {
    return (
        <LodgementComponent/>
    );
}

window.startLodgement = function startLodgement() {
    const app = createApp();
    ReactDOM.render(app, document.getElementById('app'));
};
