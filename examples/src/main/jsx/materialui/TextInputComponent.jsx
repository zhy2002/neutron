import React from 'react';
import TextField from 'material-ui/TextField';
import InputComponent from './InputComponent';


export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setValue(event.target.value);
        };
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns" style={this.props.columnStyle}>
                    <TextField
                        id={this.id}
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={this.updateValue}
                        errorText={this.state.errorMessage}
                    />
                </div>
            </div>
        );
    }

}

