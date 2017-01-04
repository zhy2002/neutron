import React from "react";
import NeutronComponent from "../bootstrap3/NeutronComponent.jsx";
import TextFieldComponent from "../bootstrap3/TextFieldComponent.jsx";
import SelectFieldComponent from "../bootstrap3/SelectFieldComponent.jsx";

export default class AddressComponent extends NeutronComponent {
    constructor(props) {
        super(props);
    }

    initialize(prop) {
        super.initialize(prop);
        this.label = this.props["label"];
    }

    extractNewState() {
        let state = super.extractNewState();
        let GWT = window["GWT"];
        state.enabled = this.model.getNodeStatus() === GWT.NodeStatusEnum.Loaded;
        return state;
    }

    render() {
        let model = this.model;
        console.log("enabled = " + this.state.enabled);
        return <div className="panel panel-default">
            <div className="panel-heading">{this.label}</div>
            <div className="panel-body">
                {this.state.enabled || <h3>This panel is disabled.</h3>}
                {this.state.enabled && <div>
                    <TextFieldComponent id={this.id + '-address'} label="Address" model={model.getPropertyAddressNode()} />
                    <SelectFieldComponent id={this.id + '-state'} label="State" model={model.getPropertyStateNode()} listName="options" />
                </div>}
            </div>
        </div>;
    }
}