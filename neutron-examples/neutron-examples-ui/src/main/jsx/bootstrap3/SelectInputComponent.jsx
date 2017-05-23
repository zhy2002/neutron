import React from 'react';
import InputComponent from './InputComponent';

export default class SelectInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            const index = parseInt(event.target.value, 10);
            this.model.setValue(this.state.list[index].getValue());
        };

        this.identifierClass = 'select-input-component';
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
                let text = item.getText();
                if (this.props.noLabel && index === 0 && !text && !item.getValue()) {
                    text = this.state.label;
                }
                options.push(
                    <option key={text} value={`${index}`}>
                        {text}
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

    renderContent() {
        const model = this.props.model;
        return (
            <select
                id={model.getUniqueId()}
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
