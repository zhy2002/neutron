import React from 'react';
import {RadioButton, RadioButtonGroup} from 'material-ui/RadioButton';
import {red500} from 'material-ui/styles/colors';

import InputComponent from './InputComponent.jsx';
import FieldErrorMessageComponent from './FieldErrorMessageComponent.jsx';


let buttonGroupStyle = {
    marginTop: "30px",
    display: "flex"
};

let buttonStyle = {
    width: "auto",
    paddingRight: "1em"
};

export default class RadioInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.listName = props["listName"];
        if (!this.listName) {
            this.listName = "options";
        }
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
        let model = this.model;
        let options = [];
        let list = model.getStateValue(this.listName);
        if (list) {
            for (let i = 0; i < list.length; i++) {
                let item = list[i];
                if(item.getValue()) {
                    options.push(
                        <RadioButton
                            key={item.getValue()}
                            label={item.getText()}
                            style={buttonStyle}
                            labelStyle={this.state.style}
                            value={item.getValue()}
                        />
                    );
                }
            }
        }

        return (
            <div className="row material-field">
                <div className="medium-12 columns"
                     id={model.getUniqueId()}
                     tabIndex="0"
                >
                    <RadioButtonGroup
                        style={buttonGroupStyle}
                        name={model.getUniqueId()}
                        valueSelected={this.state.value}
                        onChange={(event, value) => {model.setValue(value);}}
                    >
                        {options}
                    </RadioButtonGroup>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage} />
                </div>
            </div>
        );
    }

}
