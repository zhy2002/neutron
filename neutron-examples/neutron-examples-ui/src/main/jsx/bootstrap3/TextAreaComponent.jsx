import React from 'react';
import PropTypes from 'prop-types';
import InputComponent from './InputComponent';


export default class TextAreaComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.ensureDebouncingMode();
            this.model.setValue(event.target.value);
            this.flush();
        };
    }

    render() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.label;
        }
        return (
            <div className={super.renderContainerClass('text-area-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.state.label}</label>
                }
                <textarea
                    type="text"
                    className="form-control"
                    id={model.getUniqueId()}
                    value={this.state.value}
                    onChange={this.updateValue}
                    disabled={this.state.disabled}
                    readOnly={this.props.readonly || this.state.readonly}
                    rows={this.props.rows}
                    cols={this.props.cols}
                    {...conditionalProps}
                />
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }
}

TextAreaComponent.propTypes = {
    readonly: PropTypes.bool,
    rows: PropTypes.number,
    cols: PropTypes.number
};

TextAreaComponent.defaultProps = {
    readonly: false,
    rows: 6,
    cols: 80
};

