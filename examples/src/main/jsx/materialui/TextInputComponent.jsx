import React from 'react';
import TextField from "material-ui/TextField";

import InputComponent from './InputComponent.jsx';


export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.label = this.label;
        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <TextField
                        fullWidth={true}
                        floatingLabelText={this.state.label}
                        value={this.state.value}
                        onChange={(event) => {this.model.setValue(event.target.value);}}
                    />
                </div>
            </div>
        );
    }

}

