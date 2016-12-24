import React from "react";
import ReactDOM from "react-dom";
import injectTapEventPlugin from 'react-tap-event-plugin';
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import LodgementComponent from "./Lodgement.jsx";


function createRoot() {
    let GWT = window["GWT"];
    console.log('Creating root node...');
    let root = GWT.ApplicationNodeFactory.create();
    console.log(root);
    return root;
}

function createApp() {
    let model = createRoot();

    return (
        <MuiThemeProvider>
            <LodgementComponent model={model}/>
        </MuiThemeProvider>
    );
}

window.startLodgement = function () {
    injectTapEventPlugin();
    let app = createApp();
    ReactDOM.render(app, document.getElementById('app'));
};
