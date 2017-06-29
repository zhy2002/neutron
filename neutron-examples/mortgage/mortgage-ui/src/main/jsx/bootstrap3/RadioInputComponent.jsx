import React from 'react';
import InputComponent from './InputComponent';


let defaultBooleanOptions = null;

export default class RadioInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (value) => {
            this.model.setValue(value);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.list = this.getValueOptions();
        return newState;
    }

    getValueOptions() {
        let options = super.getValueOptions();
        if (options === null && this.model.getValueClassSimpleName() === 'Boolean') {
            if (!defaultBooleanOptions) { //must lazy load to wait for GWT initialization
                defaultBooleanOptions = [
                    new window.GWT.SelectOption(true, 'Yes'),
                    new window.GWT.SelectOption(false, 'No')
                ];
            }
            options = defaultBooleanOptions;
        }
        return options;
    }

    renderOptions() {
        const model = this.model;
        const options = [];
        if (this.state.list) {
            this.state.list.forEach((item, index) => {
                if (item.getValue() || item.getValue() === false) {
                    options.push(
                        <label key={item.getText()} className="radio-inline">
                            <input
                                type="radio"
                                name={model.getUniqueId()}
                                value={index}
                                onChange={() => {
                                    this.updateValue(item.getValue());
                                }}
                                checked={item.getValue() === this.state.value}
                                disabled={this.state.disabled || this.state.readonly}
                            />
                            {item.getText()}
                        </label>
                    );
                }
            }); //todo checked='...' does not work for BigDecimal
        }
        return options;
    }

    renderContent() {
        const model = this.model;
        return (
            <div id={model.getUniqueId()} tabIndex="0" className="radio-container">
                {this.renderOptions()}
            </div>
        );
    }
}
