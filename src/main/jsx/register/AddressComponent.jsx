import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";

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
        state.message = "hello";
        state.enabled = this.model.getNodeStatus() === GWT.NodeStatus.Loaded;
        return state;
    }

    render() {
        console.log("enabled = " + this.state.enabled);
        return <div className="panel panel-success">
            <h3>{this.label}</h3>
            <div>
                {this.state.enabled && <h3>Message is: {this.state.message}!</h3>}
            </div>
        </div>;
    }
}