import React from 'react';
import HeaderComponent from './HeaderComponent';
import MainComponent from './MainComponent';


export default class LodgementComponent extends React.PureComponent {

    render() {
        return (
            <div className="app-container">
                <HeaderComponent />
                <MainComponent />
            </div>
        );
    }
}
