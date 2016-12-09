import React from "react";
import FieldComponent from "./FieldComponent.jsx";

export default class FormFieldComponent extends FieldComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();
        newState.value = this.model.getValue();
        newState.fieldClass = "form-control";
        if (this.model.getTriggeredBy) {
            console.log("triggered by = " + this.model.getTriggeredBy());
            if (this.model.getTriggeredBy() === "DefaultEmailByUsernameRuleImpl") {
                newState.fieldClass += " bg-danger";
            }
        }
        if (this.model.getMessage) {
            newState.message = this.model.getMessage();
        } else {
            newState.message = "";
        }

        newState.label = this.label;
        console.log(this.label + " is required: " + this.model.getRequired());
        if (this.model.getRequired()) {
            newState.label += " *";
        }

        return newState;
    }

    render() {
        let model = this.model;
        //only read from fields and state
        return (
            <div className="form-group">
                <label htmlFor={this.id}>{this.state.label}</label>
                <input type="text" className={this.state.fieldClass} id={this.id}
                       value={this.state.value} onChange={(event) => {
                    try {
                        model.setValue(event.target.value);
                    } catch (e) {
                        console.log('Rolling back because:');
                        console.log(e);
                    }

                }}/>
                <p className="help-block">{this.state.message}</p>
            </div>
        );
    }
}