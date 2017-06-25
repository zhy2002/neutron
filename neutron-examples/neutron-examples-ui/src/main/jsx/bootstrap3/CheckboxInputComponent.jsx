import React from 'react';
import InputComponent from './InputComponent';


export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setValue(event.target.checked);
        };

        this.componentClass += ' checkbox';
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.hideLabel = true;
        return newState;
    }

    renderContent() {
        return [
            <label key="label" className="layout-helper">&nbsp;</label>,
            <label key="container" className="checkbox-container">
                <input
                    id={this.model.getUniqueId()}
                    type="checkbox"
                    onChange={this.updateValue}
                    checked={this.state.value}
                    disabled={this.state.disabled}
                    readOnly={this.state.readonly}
                />
                {!this.props.hideLabel &&
                this.state.label
                }
            </label>
        ];
    }

}
