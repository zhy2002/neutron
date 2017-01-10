import React from 'react';
import ReactDOM from 'react-dom';
import injectTapEventPlugin from 'react-tap-event-plugin';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import LodgementComponent from './Lodgement';


function createApp() {
    return (
        <MuiThemeProvider>
            <LodgementComponent />
        </MuiThemeProvider>
    );
}

window.startLodgement = function () {
    injectTapEventPlugin();
    const app = createApp();
    ReactDOM.render(app, document.getElementById('app'));
};
