import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";
import FormFieldComponent from "../FormFieldComponent.jsx";

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
        state.enabled = this.model.getNodeStatus() === GWT.NodeStatus.Loaded;
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
                    <FormFieldComponent id={this.id + '-address'} label="Address" model={model.getPropertyAddressNode()} />
                    <FormFieldComponent id={this.id + '-state'} label="State" model={model.getPropertyStateNode()} />
                </div>}
            </div>
        </div>;
    }
}