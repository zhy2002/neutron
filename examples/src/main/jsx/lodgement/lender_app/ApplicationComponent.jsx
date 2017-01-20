import React from 'react';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';

export default class ApplicationComponent extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (selectedIndex) => {
            window.alert(`hahaha ${selectedIndex}`);
        };

        this.navigate = () => {};
    }

    render() {
        return (
            <div className="application-component">
                <div className="tabs-container">
                    <nav className="navbar navbar-default">
                        <div className="container-fluid">
                            <ul className="nav navbar-nav">
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Person
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Company
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Financial Position
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Real Estates
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Products
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Additional
                                </NavDropdownComponent>
                                <NavDropdownComponent onSelect={this.navigate}>
                                    Submission
                                </NavDropdownComponent>
                            </ul>
                        </div>
                    </nav>
                </div>
                <div className="main-content">
                    <div>
                        <p>start</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>end</p>
                    </div>
                </div>
            </div>
        );
    }

}

ApplicationComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
