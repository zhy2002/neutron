import React from 'react';
import DummyNavDropdownComponent from '../bootstrap3/DummyNavDropdownComponent';

export default class LodgementHeaderComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default lodgement-header-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <span className="navbar-brand">Brand Name</span>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <DummyNavDropdownComponent model={{}} onSelect={() => {}}>
                            User Name
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
