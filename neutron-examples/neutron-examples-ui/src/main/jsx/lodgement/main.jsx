import React from 'react';
import ReactDOM from 'react-dom';
import 'react-datepicker/dist/react-datepicker.css';
import 'antd/dist/antd.css';
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
