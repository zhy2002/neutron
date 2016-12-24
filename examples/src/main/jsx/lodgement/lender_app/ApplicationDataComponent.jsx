import React from "react";
import {Tabs, Tab} from "material-ui/Tabs";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import PersonDataComponent from "./PersonDataComponent.jsx";


export default class ApplicationDataComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;

        console.log("ApplicationDataComponent model: ");
        console.log(model);

        return (
            <div className="expanded row">
                <div className="medium-12">
                    <Tabs>
                        <Tab label="Person">
                            <PersonDataComponent model={model}/>
                        </Tab>
                        <Tab label="Company">test2</Tab>
                        <Tab label="Financial Position">test3</Tab>
                        <Tab label="Real Estates">test4</Tab>
                        <Tab label="Products">test5</Tab>
                        <Tab label="Additional">test6</Tab>
                        <Tab label="Submission">test7</Tab>
                    </Tabs>
                </div>
            </div>
        );
    }

}