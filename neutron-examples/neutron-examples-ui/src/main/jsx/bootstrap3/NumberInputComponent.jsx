import React from 'react';
import InputComponent from './InputComponent';


export default class NumberInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            this.model.setText(event.target.value);
            context.debouncedExitDebouncingMode();
        };
    }

    getUiValue() {
        return this.model.getText();
    }

    renderInput() {
        const model = this.model;

        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.state.label;
        }

        return (
            <input
                type="text"
                className="form-control"
                id={model.getUniqueId()}
                value={this.state.value}
                onChange={this.updateValue}
                disabled={this.state.disabled}
                readOnly={this.state.readonly}
                {...conditionalProps}
            />
        );
    }

    renderContent() {
        const model = this.model;
        if (!model.getCurrencyInfo && !model.getSuffixSymbol) {
            return this.renderInput();
        }

        return (
            <div className="input-group">
                {model.getCurrencyInfo &&
                <div className="input-group-addon">{model.getCurrencyInfo().getSymbol()}</div>
                }
                {this.renderInput()}
                {model.getSuffixSymbol &&
                <div className="input-group-addon">{model.getSuffixSymbol().getSymbol()}</div>
                }
            </div>
        );
    }

}
