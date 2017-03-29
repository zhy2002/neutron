import React from 'react';
import InputComponent from './InputComponent';

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
        if (options === null) { //assume binding to a boolean node
            options = [
                new GWT.SelectOption(true, 'Yes'),
                new GWT.SelectOption(false, 'No')
            ];
        }
        console.log('options:');
        console.log(options);
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
                            />
                            {item.getText()}
                        </label>
                    );
                }
            });
        }
        return options;
    }

    render() {
        const model = this.props.model;
        return (
            <div className={super.renderContainerClass('radio-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.state.label}</label>
                }
                <div id={model.getUniqueId()} tabIndex="0" className="radio-container">
                    {this.renderOptions()}
                </div>
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }

}
