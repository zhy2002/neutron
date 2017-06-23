import React from 'react';
import InputComponent from './InputComponent';
import CommonUtil from '../neutron/CommonUtil';


export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            console.log(event.target.checked);
            this.model.setValue(event.target.checked);
        };

        this.identifierClass = 'checkbox checkbox-input-component';
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
                    id={this.id}
                    type="checkbox"
                    onChange={this.updateValue}
                    checked={this.state.value}
                    disabled={this.state.disabled}
                    readOnly={this.state.readonly}
                />
                {!this.props.hideLabel &&
                CommonUtil.removeTrailing(this.state.label, ' Flag')
                }
            </label>
        ];
    }

}
