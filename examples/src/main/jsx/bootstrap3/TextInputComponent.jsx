import React from 'react';
import InputComponent from './InputComponent';

export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setValue(event.target.value);
        };
    }

    render() {
        const model = this.model;

        return (
            <div className="form-group form-group-sm text-input-component" style={this.state.style}>
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                <input
                    type="text"
                    className="form-control"
                    id={model.getUniqueId()}
                    value={this.state.value}
                    onChange={this.updateValue}
                />
            </div>
        );
    }
}
