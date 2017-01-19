import React from 'react';
import NavDropdownComponent from '../bootstrap3/NavDropdownComponent';


export default class HeaderComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default app-header">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <span className="navbar-brand">Brand Name</span>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <NavDropdownComponent>
                            User Name
                        </NavDropdownComponent>
                        <NavDropdownComponent>
                            <span className="glyphicon glyphicon-user" />
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
