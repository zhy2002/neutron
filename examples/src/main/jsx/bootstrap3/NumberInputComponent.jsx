import React from 'react';
import InputComponent from './InputComponent';

export default class NumberInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setText(event.target.value);
        };
    }

    getUiValue() {
        return this.model.getText();
    }

    render() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.label;
        }
        return (
            <div className={super.renderContainerClass('number-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                }
                <input
                    type="text"
                    className="form-control"
                    id={model.getUniqueId()}
                    value={this.state.value}
                    onChange={this.updateValue}
                    {...conditionalProps}
                />
            </div>
        );
    }
}
