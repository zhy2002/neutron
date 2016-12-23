import React from "react";
import NeutronComponent from "../bootstrap3/NeutronComponent.jsx";
import TextFieldComponent from "../bootstrap3/TextFieldComponent.jsx";

export default class AddressComponent extends NeutronComponent {
    constructor(props) {
        super(props);
    }

    initialize(prop) {
        super.initialize(prop);
        this.label = this.props["label"];
    }

    render() {
        let model = this.model;
        return <div className="panel panel-default">
            <div className="panel-heading">{this.label}</div>
            <div className="panel-body">
                <TextFieldComponent id={this.id + '-country'} label="Country" model={model.getCountryCodeNode()}/>
                <TextFieldComponent id={this.id + '-area'} label="Area" model={model.getAreaCodeNode()}/>
                <TextFieldComponent id={this.id + '-phone'} label="Phone" model={model.getPhoneNumberNode()}/>
            </div>
        </div>;
    }
}