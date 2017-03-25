import React from 'react';
import DummyNavDropdownComponent from '../bootstrap3/DummyNavDropdownComponent';

export default class LodgementHeaderComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default lodgement-header-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <img src="img/site_logo.png" alt="Site Logo" height="50px" />
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <DummyNavDropdownComponent model={{}} onSelect={() => {}}>
                            Demo User
                        </DummyNavDropdownComponent>
                        <DummyNavDropdownComponent model={{}} onSelect={() => {}}>
                            <span className="glyphicon glyphicon-user"/>
                        </DummyNavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
