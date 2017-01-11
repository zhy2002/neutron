import React from 'react';
import HeaderComponent from './HeaderComponent';
import MainComponent from './MainComponent';


export default class LodgementComponent extends React.PureComponent {

    render() {
        return (
            <div>
                <HeaderComponent />
                <MainComponent />
            </div>
        );
    }
}
