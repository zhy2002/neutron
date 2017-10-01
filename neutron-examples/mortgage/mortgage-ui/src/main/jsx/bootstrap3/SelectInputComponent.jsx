import React from 'react';
import InputComponent from './InputComponent';


const emptyOptions = [];

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
        newState.list = super.getValueOptions() || emptyOptions;
        return newState;
    }

    renderOptions() {
        const options = [];
        this.state.list.forEach((item, index) => {
            const text = item.getText();
            options.push(
                <option key={text} value={`${index}`}>
                    {text}
                </option>
            );
        });
        return options;
    }

    valueIndex() {
        const value = this.state.value;
        const list = this.state.list;
        let index = 0; //the empty option
        for (let i = 0; i < list.length; i++) {
            const item = list[i];
            if (item.getValue() === value) { //todo does not work for BigDecimal
                index = i;
                break;
            }
        }
        return index;
    }

    renderContent() {
        return (
            <select
                id={this.model.getUniqueId()}
                className="form-control"
                value={`${this.valueIndex()}`}
                onChange={this.updateValue}
                disabled={this.state.readonly || this.state.disabled}
            >
                {this.renderOptions()}
            </select>
        );
    }
}
