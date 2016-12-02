import React from "react";

export default class FormCheckboxComponent extends React.Component {

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
        console.log('extract new state');
        var newState = {};
        newState.value = this.model.getValue();
        return newState;
    }

    onUiNodeChanged() {
        var newState = this.extractNewState();
        this.setState(newState);
    }

    render() {
        var model = this.model;
        //only read from fields and state
        return (
            <div id={this.id} className="checkbox" checked="checked">
                <label htmlFor={this.id}>
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