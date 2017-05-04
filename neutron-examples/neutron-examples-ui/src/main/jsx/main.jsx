import React from 'react';
import ReactDOM from 'react-dom';
import '../assets/stylesheets/app.scss';
import LodgementComponent from './lodgement/LodgementComponent';


window.startLodgement = () => {
    ReactDOM.render(<LodgementComponent/>, document.getElementById('app'));
};
