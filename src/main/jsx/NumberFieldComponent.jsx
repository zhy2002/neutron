import React from "react";
import FieldComponent from "./FieldComponent.jsx";

export default class NumberFieldComponent extends FieldComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.value = this.model.getText();

        newState.fieldClass = "form-control";
        console.log(this.model.getText());
        console.log(this.model.getValue());
        if (this.model.getText() && !this.model.getValue()) {
            newState.fieldClass += " bg-danger";
        }

        return newState;
    }

    render() {
        console.log("rending state:");
        console.log(this.state);
        let model = this.model;
        //only read from fields and state
        return (
            <div className="form-group">
                <label htmlFor={this.id}>{this.state.label}</label>
                <input type="text" className={this.state.fieldClass} id={this.id}
                       value={this.state.value} onChange={(event) => {
                    try {
                        model.setText(event.target.value);
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