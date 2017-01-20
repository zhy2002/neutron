import React from 'react';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';
import NavDropdownComponent from '../bootstrap3/NavDropdownComponent';
import ApplicationToolbarComponent from './lender_app/ApplicationToolbarComponent';
import ApplicationComponent from './lender_app/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';

function renderBody(model) {
    if (model.getNodeLabel) {
        return (
            <ApplicationComponent model={model}/>
        );
    }

    return (
        <ApplicationListComponent model={model}/>
    );
}

function getDummyData() {
    const dummyAppNode = {
        getNodeLabel: function getNodeLabel() {
        },
        getUniqueId: () => 'n111',
        getName: () => 'dummy',
        getValidationErrorList: function getValidationErrorList() {
            return {size: () => 0};
        },
        addChangeListener: function addChangeListener() {
        },
        removeChangeListener: function removeChangeListener() {
        },
        getRequired: () => false,
        hasValue: () => false
    };
    return [
        {name: 'Application Manager', model: {}},
        {name: 'NAB', model: dummyAppNode},
        {name: 'Suncorp', model: dummyAppNode}
    ];
}

export default class LodgementComponent extends React.PureComponent {

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

        this.onNewApp = () => {
            window.alert('todo create new app');
        };
    }

    renderToolbar(model) {
        if (model.getNodeLabel) {
            return <ApplicationToolbarComponent model={model}/>;
        }

        return <AppManagerToolbarComponent model={model} onNewApp={this.onNewApp}/>;
    }

    render() {
        const tabItems = getDummyData();
        const selectedModel = tabItems[this.state.selectedIndex].model;
        return (
            <div className="lodgement-component">
                <div className="app-header-container">
                    <nav className="navbar navbar-default">
                        <div className="container-fluid">
                            <div className="navbar-header">
                                <span className="navbar-brand">Brand Name</span>
                            </div>
                            <ul className="nav navbar-nav navbar-right">
                                <NavDropdownComponent>
                                    User Name
                                </NavDropdownComponent>
                                <NavDropdownComponent>
                                    <span className="glyphicon glyphicon-user"/>
                                </NavDropdownComponent>
                            </ul>
                        </div>
                    </nav>
                </div>
                <div className="app-tabs-container">
                    <NavPillsComponent
                        items={tabItems}
                        selectedIndex={this.state.selectedIndex}
                        onSelect={this.selectTab}
                        onClose={this.closeTab}
                    />
                </div>
                <div className="app-toolbar-container">
                    {this.renderToolbar(selectedModel)}
                </div>
                <div className="app-body-container">
                    {renderBody(selectedModel)}
                </div>
            </div>
        );
    }
}
