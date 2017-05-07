import React from 'react';
import DummyNavDropdownComponent from '../bootstrap3/DummyNavDropdownComponent';

export default class LodgementBannerComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.nop = () => {
        };
    }

    render() {
        return (
            <nav className="navbar navbar-default lodgement-banner-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <img src="img/site_logo.png" alt="Site Logo" height="50px"/>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <DummyNavDropdownComponent model={{}} onSelect={this.nop}>
                            Demo User
                        </DummyNavDropdownComponent>
                        <DummyNavDropdownComponent model={{}} onSelect={this.nop}>
                            <span className="glyphicon glyphicon-user"/>
                        </DummyNavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
