import React from 'react';
import ReactDOM from 'react-dom';
import injectTapEventPlugin from 'react-tap-event-plugin';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import LodgementComponent from './Lodgement';


const muiTheme = getMuiTheme({
    spacing: {
        iconSize: 24,
        desktopGutter: 12,
        desktopGutterMore: 16,
        desktopGutterLess: 8,
        desktopGutterMini: 4,
        desktopKeylineIncrement: 60,  // left-nav width = this * 4
        desktopDropDownMenuItemHeight: 24,
        desktopDropDownMenuFontSize: 12,
        desktopLeftNavMenuItemHeight: 24,
        desktopSubheaderHeight: 32,
        desktopToolbarHeight: 42
    }
});

function createApp() {
    return (
        <MuiThemeProvider muiTheme={muiTheme}>
            <LodgementComponent/>
        </MuiThemeProvider>
    );
}

window.startLodgement = function startLodgement() {
    injectTapEventPlugin();
    const app = createApp();
    ReactDOM.render(app, document.getElementById('app'));
};
