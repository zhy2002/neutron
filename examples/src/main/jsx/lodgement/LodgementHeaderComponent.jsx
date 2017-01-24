import React from 'react';
import NavDropdownComponent from '../bootstrap3/NavDropdownComponent';

export default class LodgementHeaderComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default lodgement-header-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <span className="navbar-brand">Brand Name</span>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <NavDropdownComponent model={{}} onSelect={() => {}}>
                            User Name
                        </NavDropdownComponent>
                        <NavDropdownComponent model={{}} onSelect={() => {}}>
                            <span className="glyphicon glyphicon-user"/>
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
