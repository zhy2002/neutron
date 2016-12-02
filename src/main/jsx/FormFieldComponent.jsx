import React from "react";

export default class FormFieldComponent extends React.Component {

    constructor(props) {
        super(props);

        //const fields
        this.id = props["id"];
        this.label = props["label"];
        this.model = props["model"];
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
    }

    extractNewState() {
        var newState = {};
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

    componentDidMount() {
        console.log(this.label + " did mount");
    }

    onUiNodeChanged() {
        var newState = this.extractNewState();
        this.setState(newState);
    }

    render() {
        var model = this.model;
        //only read from fields and state
        return (
            <div className="form-group">
                <label htmlFor={this.id}>{this.state.label}</label>
                <input type="text" className={this.state.fieldClass} id={this.id}
                       value={this.state.value} onChange={(event) => {
                    model.setValue(event.target.value);
                }}/>
                <p className="help-block">{this.state.message}</p>
            </div>
        );
    }
}