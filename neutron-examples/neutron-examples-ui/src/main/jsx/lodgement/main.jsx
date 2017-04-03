import React from 'react';
import ReactDOM from 'react-dom';
import 'react-datepicker/dist/react-datepicker.css';
import 'antd/dist/antd.css';
import LodgementComponent from './LodgementComponent';


window.startLodgement = () => {
    ReactDOM.render(<LodgementComponent/>, document.getElementById('app'));
};
