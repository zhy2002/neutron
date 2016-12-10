import React from "react";
import FieldComponent from "./FieldComponent.jsx";

export default class SelectFieldComponent extends FieldComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.listName = props["listName"];
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.value = this.model.getValue();

        newState.list = this.model.getStateValue(this.listName);

        return newState;
    }

    render() {
        let model = this.model;
        let options = [];
        for (let i = 0; i < this.state.list.length; i++) {
            let item = this.state.list[i];
            options.push(<option key={item.getValue()} value={item.getValue()}>{item.getText()}</option>);
        }
        return (
            <div className="form-group">
                <label htmlFor={this.id}>{this.state.label}</label>
                <select className="form-control" id={this.id} value={this.state.value} onChange={(event) => {
                    try {
                        model.setValue(event.target.value);
                    } catch (e) {
                        console.log('Rolling back because:');
                        console.log(e);
                    }
                }}>
                    {options}
                </select>
                <p className="help-block">{this.state.message}</p>
            </div>
        );
    }
}

SelectFieldComponent.propTypes = {
    listName: React.PropTypes.string.isRequired
};