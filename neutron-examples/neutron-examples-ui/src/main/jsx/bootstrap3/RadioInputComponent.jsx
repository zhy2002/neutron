import React from 'react';
import InputComponent from './InputComponent';

export default class RadioInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (value) => {
            this.model.setValue(value);
        };

        this.identifierClass = 'radio-input-component';
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.list = this.getValueOptions();
        return newState;
    }

    getValueOptions() {
        let options = super.getValueOptions();
        if (options === null) { //assume binding to a boolean node
            options = [
                new GWT.SelectOption(true, 'Yes'),
                new GWT.SelectOption(false, 'No')
            ];
        }
        return options;
    }

    renderOptions() {
        const model = this.props.model;
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
                                disabled={this.state.disabled}
                                readOnly={this.state.readonly}
                            />
                            {item.getText()}
                        </label>
                    );
                }
            });
        }
        return options;
    }

    renderContent() {
        const model = this.props.model;
        return (
            <div id={model.getUniqueId()} tabIndex="0" className="radio-container">
                {this.renderOptions()}
            </div>
        );
    }

}
