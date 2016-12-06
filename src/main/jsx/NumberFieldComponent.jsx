import React from "react";

export default class NumberFieldComponent extends React.Component {

    constructor(props) {
        super(props);

        //const fields
        this.id = props["id"];
        this.label = props["label"];
        this.model = props["model"];
        this.model.addChangeListener(this);
        window.fieldMap[this.model.getUniqueId()] = this.id;
        this.state = this.extractNewState();
    }

    extractNewState() {
        var newState = {};
        newState.value = this.model.getText();
        newState.fieldClass = "form-control";
        console.log(this.model.getText());
        console.log(this.model.getValue());
        if (this.model.getText() && !this.model.getValue()) {
            newState.fieldClass += " bg-danger";
        }
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