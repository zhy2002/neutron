import React from "react";
import FieldComponent from "./FieldComponent.jsx";

export default class FormCheckboxComponent extends FieldComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        let model = this.model;
        //only read from fields and state
        return (
            <div id={this.id} className="checkbox" checked="checked">
                <label>
                    <input type="checkbox"
                           id={this.id}
                           checked={this.state.value}
                           onChange={(event) => {
                               model.setValue(event.target.checked);
                           }}/> {this.label}
                </label>
            </div>
        );
    }
}