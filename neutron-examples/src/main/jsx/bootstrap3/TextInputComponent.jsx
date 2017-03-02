import React from 'react';
import InputComponent from './InputComponent';

export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setValue(event.target.value);
        };
    }

    render() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.label;
        }
        return (
            <div className={super.renderContainerClass('text-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                }
                <input
                    type="text"
                    className="form-control"
                    id={model.getUniqueId()}
                    value={this.state.value}
                    onChange={this.updateValue}
                    disabled={this.state.disabled}
                    readOnly={this.props.readonly}
                    {...conditionalProps}
                />
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }
}

TextInputComponent.propTypes = {
    readonly: React.PropTypes.bool
};

TextInputComponent.defaultProps = {
    readonly: false
};

