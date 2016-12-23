import React from "react";
import ReactDOM from "react-dom";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import LodgementComponent from "./Lodgement.jsx";

function createRoot() {
    let GWT = window["GWT"];
    console.log('Creating root node...');
    let root = {};//GWT.LodgementNodeFactory.create();
    console.log(root);
    return root;
}

function createApp(model) {
    return (
        <MuiThemeProvider>
            <LodgementComponent model={model}/>
        </MuiThemeProvider>
    );
}

window.startLodgement = function () {
    let model = createRoot();
    let app = createApp(model);
    ReactDOM.render(app, document.getElementById('app'));
};
