import React from 'react';
import TextField from "material-ui/TextField";

import InputComponent from './InputComponent.jsx';


export default class TextInputComponent extends InputComponent {

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
                    <TextField
                        id={model.getUniqueId()}
                        fullWidth={true}
                        floatingLabelText={this.state.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={(event) => {model.setValue(event.target.value);}}
                        errorText={this.state.errorMessage}
                    />
                </div>
            </div>
        );
    }

}

