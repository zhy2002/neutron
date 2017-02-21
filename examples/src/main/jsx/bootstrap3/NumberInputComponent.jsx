import React from 'react';
import InputComponent from './InputComponent';

export default class NumberInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setText(event.target.value);
        };
    }

    getUiValue() {
        return this.model.getText();
    }

    renderInput() {
        const model = this.model;

        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.label;
        }

        return (
            <input
                type="text"
                className="form-control"
                id={model.getUniqueId()}
                value={this.state.value}
                onChange={this.updateValue}
                readOnly={this.props.readonly}
                {...conditionalProps}
            />
        );
    }

    renderInputGroup() {
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

    render() {
        const model = this.model;
        return (
            <div className={super.renderContainerClass('number-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                }
                {this.renderInputGroup()}
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }
}

NumberInputComponent.propTypes = {
    readonly: React.PropTypes.bool
};

NumberInputComponent.defaultProps = {
    readonly: false
};
