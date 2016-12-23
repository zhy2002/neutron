import React from "react";
import NeutronComponent from "./NeutronComponent.jsx";

export default class FieldComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.label = props["label"];
        window.fieldMap[this.model.getUniqueId()] = this.id;
    }

    extractNewState() {
        let newState = super.extractNewState();

        if (this.model.getMessage) {
            newState.message = this.model.getMessage();
        } else {
            newState.message = "";
        }

        newState.label = this.label;
        if (this.model.getRequired()) {
            newState.label += " *";
        }

        return newState;
    }
}

FieldComponent.propTypes = {
    label: React.PropTypes.string.isRequired
};