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
}

FieldComponent.propTypes = {
    label: React.PropTypes.string.isRequired
};