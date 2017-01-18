import React from 'react';


export default class HeaderComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default app-header">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <span className="navbar-brand">Brand Name</span>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <li className="dropdown">
                            <a tabIndex="0" className="dropdown-toggle">
                                User Name <span className="caret"/>
                            </a>
                            <ul className="dropdown-menu">
                                <li><a tabIndex="0">Action</a></li>
                                <li><a tabIndex="0">Another action</a></li>
                                <li><a tabIndex="0">Something else here</a></li>
                                <li role="separator" className="divider"/>
                                <li><a tabIndex="0">Separated link</a></li>
                                <li role="separator" className="divider"/>
                                <li><a tabIndex="0">One more separated link</a></li>
                            </ul>
                        </li>
                        <li className="dropdown">
                            <a tabIndex="0" className="dropdown-toggle icon-wrapper">
                                <span className="glyphicon glyphicon-user" />
                                <span className="caret" />
                            </a>
                            <ul className="dropdown-menu">
                                <li><a tabIndex="0">Action</a></li>
                                <li><a tabIndex="0">Another action</a></li>
                                <li><a tabIndex="0">Something else here</a></li>
                                <li role="separator" className="divider" />
                                <li><a tabIndex="0">Separated link</a></li>
                                <li role="separator" className="divider" />
                                <li><a tabIndex="0">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        );
    }
}
