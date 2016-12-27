import React from 'react';
import Checkbox from 'material-ui/Checkbox';

import InputComponent from './InputComponent.jsx';


let style = {
    marginTop: "30px"
};

export default class CheckboxInputComponent extends InputComponent {

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

        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <Checkbox
                        style={style}
                        label={this.state.label}
                        labelStyle={this.state.style}
                        checked={this.state.value}
                        onCheck={(event, isChecked) => {
                            model.setValue(isChecked);
                        }}
                    />
                </div>
            </div>
        );
    }

}