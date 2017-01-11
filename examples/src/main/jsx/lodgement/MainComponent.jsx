import React from 'react';
import {Tabs, Tab} from 'material-ui/Tabs';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';
import LenderApplicationComponent from './lender_app/LenderApplicationComponent';

function createApplicationNode() {
    return window.GWT.ApplicationNodeFactory.create();
}

export default class MainComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            openApps: [],
            currentTab: '0'
        };

        this.selectTab = (currentTab) => {
            this.setState({currentTab});
        };

        this.createNewApp = () => {
            const existingTabs = this.state.openApps;
            if (existingTabs.length >= 5) {
                window.alert('Cannot open more tabs!');
                return;
            }

            const newApp = {
                model: createApplicationNode()
            };

            const openApps = [...existingTabs, newApp];
            this.setState({
                openApps,
                currentTab: `${openApps.length}`
            });
        };
    }

    renderAppTabs() {
        const appTabs = [];
        for (let i = 0; i < this.state.openApps.length; i++) {
            const app = this.state.openApps[i];
            const tabNumber = `${i + 1}`;
            const tabTitle = `App ${tabNumber}`;
            appTabs.push(
                <Tab key={tabNumber} label={tabTitle} value={tabNumber}>
                    <LenderApplicationComponent model={app.model}/>
                </Tab>
            );
        }
        return appTabs;
    }

    render() {
        const appTabs = this.renderAppTabs();

        return (
            <div>
                <Tabs
                    value={this.state.currentTab}
                    onChange={this.selectTab}
                >
                    <Tab label="Application Manager" value="0" key="0">
                        <AppManagerToolbarComponent onNewApp={this.createNewApp}/>
                        <ApplicationListComponent />
                    </Tab>
                    {appTabs}
                </Tabs>
            </div>
        );
    }
}
