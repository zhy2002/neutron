import React from "react";
import {Tabs, Tab} from "material-ui/Tabs";
import AppManagerToolbarComponent from "./app_manager/AppManagerToolbarComponent.jsx";
import ApplicationListComponent from "./app_manager/ApplicationListComponent.jsx";
import LenderApplicationComponent from "./lender_app/LenderApplicationComponent.jsx";

function createRoot() {
    let GWT = window["GWT"];
    console.log('Creating root node...');
    let root = GWT.ApplicationNodeFactory.create();
    console.log(root);
    return root;
}

export default class MainComponent extends React.Component {

    constructor(props) {
        super(props);

        console.log('MainComponent created.');

        this.state = {
            openApps: [],
            currentTab: "0"
        };
    }

    selectTab(currentTab) {
        this.setState({currentTab});
    }

    createNewApp() {
        const existingTabs = this.state.openApps;
        if (existingTabs.length >= 5) {
            window.alert("Cannot open more tabs!");
            return;
        }

        let newApp = {
            model: createRoot()
        };

        const openApps = [...existingTabs, newApp];
        this.setState({
            openApps: openApps,
            currentTab: "" + openApps.length
        });
    }

    render() {
        const appTabs = [];
        for (let i = 0; i < this.state.openApps.length; i++) {
            let app = this.state.openApps[i];
            let tabNumber = "" + (i + 1);
            let tabTitle = "App " + tabNumber;
            appTabs.push(
                <Tab key={tabNumber} label={tabTitle} value={tabNumber}>
                    <LenderApplicationComponent model={app.model}/>
                </Tab>
            );
        }

        return (
            <div>
                <Tabs
                    value={this.state.currentTab}
                    onChange={this.selectTab.bind(this)}>
                    <Tab label="Application Manager" value="0" key="0">
                        <AppManagerToolbarComponent onNewApp={this.createNewApp.bind(this)}/>
                        <ApplicationListComponent />
                    </Tab>
                    {appTabs}
                </Tabs>
            </div>
        );
    }

}