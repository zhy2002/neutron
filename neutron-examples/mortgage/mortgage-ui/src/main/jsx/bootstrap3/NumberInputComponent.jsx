import React from 'react';
import InputComponent from './InputComponent';
import FormattingService from '../neutron/FormattingService';


export default class NumberInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            this.model.setText(event.target.value);
            context.debouncedExitDebouncingMode();
        };

        this.state.hasFocus = false;

        this.handleFocus = () => {
            this.setState({hasFocus: true});
        };

        this.handleBlur = () => {
            this.setState({hasFocus: false});
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.valueText = this.model.getText();
        newState.isInteger = this.model.isIntegerValue();
        newState.displayFormat = this.model.getValueDisplayFormat();
        return newState;
    }

    renderInput() {
        const model = this.model;

        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.state.label;
        }

        let value = this.state.valueText;
        if (!this.state.hasFocus && this.state.value && this.state.displayFormat === 'default') {
            value = FormattingService.formatNumber(value, this.state.isInteger ? 0 : 2);
        }

        return (
            <input
                type="text"
                className="form-control"
                id={model.getUniqueId()}
                value={value}
                onChange={this.updateValue}
                onFocus={this.handleFocus}
                onBlur={this.handleBlur}
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
