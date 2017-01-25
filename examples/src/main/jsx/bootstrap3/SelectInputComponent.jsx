import React from 'react';
import InputComponent from './InputComponent';

export default class SelectInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            const index = parseInt(event.target.value, 10);
            this.model.setValue(this.state.list[index].getValue());
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.list = super.getValueOptions();
        return newState;
    }

    renderOptions() {
        const options = [];
        if (this.state.list) {
            this.state.list.forEach((item, index) => {
                options.push(
                    <option key={item.getText()} value={`${index}`}>
                        {item.getText()}
                    </option>
                );
            });
        }
        return options;
    }

    valueIndex() {
        const value = this.state.value;
        const list = this.state.list;
        let index = 0;
        for (let i = 0; i < list.length; i++) {
            const item = list[i];
            if (item.getValue() === value) {
                index = i;
                break;
            }
        }
        return index;
    }

    render() {
        const model = this.props.model;
        return (
            <div className={`form-group form-group-sm select-input-component${this.state.componentClass}`}>
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                <select
                    id={model.getUniqueId()}
                    className="form-control"
                    value={`${this.valueIndex()}`}
                    onChange={this.updateValue}
                >
                    {this.renderOptions()}
                </select>
            </div>
        );
    }
}
