import React from 'react';
import Checkbox from 'material-ui/Checkbox';
import {red500} from 'material-ui/styles/colors';

import InputComponent from './InputComponent.jsx';
import FieldErrorMessageComponent from './FieldErrorMessageComponent.jsx';

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

        if(newState.errorMessage) {
            newState.style.color = red500;
        }
        return newState;
    }

    render() {
        const model = this.model;

        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <Checkbox
                        id={model.getUniqueId()}
                        style={style}
                        label={this.state.label}
                        labelStyle={this.state.style}
                        checked={this.state.value}
                        onCheck={(event, isChecked) => {
                            model.setValue(isChecked);
                        }}
                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage} />
                </div>
            </div>
        );
    }

}