import React from 'react';
import TextField from 'material-ui/TextField';
import InputComponent from './InputComponent';


export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    /**
     * Extract all the state values needed for rendering
     * from model.
     * @returns {*} the complete state object.
     */
    extractNewState() {
        const newState = super.extractNewState();

        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        const model = this.model;

        return (
            <div className="row material-field">
                <div className="medium-12 columns" style={this.columnStyle}>
                    <TextField
                        id={this.id}
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={(event) => {
                            model.setValue(event.target.value);
                        }}
                        errorText={this.state.errorMessage}
                    />
                </div>
            </div>
        );
    }

}

