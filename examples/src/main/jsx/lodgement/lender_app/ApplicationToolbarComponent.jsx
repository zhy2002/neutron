import React from "react";
import {Toolbar, ToolbarGroup} from "material-ui/Toolbar";
import RaisedButton from "material-ui/RaisedButton";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import ApplicantSelectionList from "./ApplicantSelectionComponent.jsx";
import CommonUtil from "../CommonUtil.jsx";

const toolbarStyle = {
    backgroundColor: "#FFF"
};

export default class ApplicationToolbarComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    showJson() {
        let obj = CommonUtil.extractValue(this.model);
        console.log("extracted object:");
        console.log(obj);
        window.alert(JSON.stringify(obj));
    }


    loadJson() {
        let model = this.model;
        $.get(
            "json/application/app1.json",
            function(data) {
                let context = model.getContext();
                context.beginSession();
                CommonUtil.setValue(model, data);
                context.commitSession();
            }
        );
    }

    render() {
        let model = this.model;

        return (
            <Toolbar style={toolbarStyle}>
                <ApplicantSelectionList model={model.getPersonListNode()}/>
                <ToolbarGroup>
                    <RaisedButton label="Validate" primary={true} onMouseUp={() => {
                        model.refresh();
                    }}/>
                    <RaisedButton label="Show JSON" primary={true} onMouseUp={this.showJson.bind(this)}/>
                    <RaisedButton label="Load JSON" primary={true} onMouseUp={this.loadJson.bind(this)}/>
                </ToolbarGroup>
            </Toolbar>
        );
    }
}