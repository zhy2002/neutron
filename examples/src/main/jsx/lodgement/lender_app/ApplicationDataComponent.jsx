import React from "react";
import {Tabs, Tab} from "material-ui/Tabs";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import PersonListViewComponent from "./PersonListViewComponent.jsx";


let tabStyle = {
    whiteSpace: "initial"
};

export default class ApplicationDataComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    selectTab(currentTab) {
        this.model.setSelectedName(currentTab);
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.currentTab = this.model.getSelectedName();

        return newState;
    }

    render() {
        let model = this.model;

        console.log("ApplicationDataComponent model: ");
        console.log(model);

        return (
            <div className="expanded row">
                <div className="medium-12">
                    <Tabs value={this.state.currentTab}
                          onChange={this.selectTab.bind(this)}
                          tabItemContainerStyle={tabStyle}>
                        <Tab label="Person" value="personListNode">
                            <PersonListViewComponent model={model.getPersonListNode()}/>
                        </Tab>
                        <Tab label="Company" value="companyListNode">test2</Tab>
                        <Tab label="Financial Position" value="financialPositionNode">test3</Tab>
                        <Tab label="Real Estates" value="realEstateListNode">test4</Tab>
                        <Tab label="Products" value="productsNode">test5</Tab>
                        <Tab label="Additional" value="additionalNode">test6</Tab>
                        <Tab label="Submission" value="submissionNode">test7</Tab>
                    </Tabs>
                </div>
            </div>
        );
    }

}