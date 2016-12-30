import React from "react";
import {Tabs, Tab} from "material-ui/Tabs";

import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent.jsx';
import ApplicationListComponent from './app_manager/ApplicationListComponent.jsx';
import LenderApplicationComponent from './lender_app/LenderApplicationComponent.jsx';
import ValidationErrorsComponent from './ValidationErrorsComponent.jsx';
import NeutronComponent from '../materialui/NeutronComponent.jsx';

export default class MainComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        console.log('MainComponent created.');
    }

    extractNewState() {
        let state = super.extractNewState();
        state.value = 'b';
        return state;
    }

    selectTab(value) {
        this.setState({value});
    }

    render() {

        let model = this.model;
        console.log('MainComponent model is:');
        console.log(model);

        return (
            <div >
                <Tabs
                    value={this.state.value}
                    onChange={this.selectTab.bind(this)}>
                    <Tab label="Application Manager" value="a">
                        <AppManagerToolbarComponent />
                        <ApplicationListComponent />
                    </Tab>
                    <Tab label="App 1" value="b">
                        <LenderApplicationComponent model={model} />
                    </Tab>
                </Tabs>
                <ValidationErrorsComponent model={model} />
            </div>
        );
    }
}