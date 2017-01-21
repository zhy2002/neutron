import React from 'react';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import ApplicationToolbarComponent from './lender_app/ApplicationToolbarComponent';
import ApplicationComponent from './lender_app/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';

const lenders = ['NAB', 'CBA', 'Westpac'];
let nextLender = 0;

function createApplicationNode() {
    const node = window.GWT.ApplicationNodeFactory.create();
    node.setNodeLabel(lenders[nextLender++]);
    nextLender %= lenders.length;
    return node;
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
}

function renderBody(model) {
    if (model.getName() === 'appManagerNode') {
        return (
            <ApplicationListComponent model={model}/>
        );
    }

    return (
        <ApplicationComponent model={model}/>
    );
}

export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            lodgementNode: createLodgementNode(),
            openApps: [],
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (tabIndex) => {
            if (window.confirm('Are you sure you want to close the application?')) {
                const openApps = this.state.openApps;
                const newApps = [];
                const appIndex = tabIndex - 1;
                openApps.forEach((item, i) => {
                    if (i === appIndex)
                        return;
                    newApps.push(item);
                });
                let selectedIndex = tabIndex;
                if (selectedIndex > newApps.length) {
                    selectedIndex = newApps.length;
                }
                this.setState({
                    openApps: newApps,
                    selectedIndex
                });
            }
        };

        this.onNewApp = () => {
            const openApps = this.state.openApps;
            if (openApps.length >= 5) {
                window.alert('Cannot open more tabs!');
                return;
            }

            const newApp = createApplicationNode();

            const newApps = [...openApps, newApp];
            this.setState({
                openApps: newApps,
                selectedIndex: newApps.length
            });
        };
    }

    renderToolbar(model) {
        if (model.getName() === 'appManagerNode') {
            return <AppManagerToolbarComponent model={model} onNewApp={this.onNewApp}/>;
        }

        return <ApplicationToolbarComponent model={model}/>;
    }

    render() {
        const tabItems = [this.state.lodgementNode.getAppManagerNode(), ...this.state.openApps];
        const selectedModel = tabItems[this.state.selectedIndex];
        return (
            <div className="lodgement-component">
                <div className="app-header-container">
                    <LodgementHeaderComponent />
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
