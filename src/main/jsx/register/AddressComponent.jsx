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
        return <div className="panel panel-default">
            <div className="panel-heading">{this.label}</div>
            <div className="panel-body">
                {this.state.enabled || <h3>This panel is disabled.</h3>}
                {this.state.enabled && <h3>Message is: {this.state.message}!</h3>}
            </div>
        </div>;
    }
}