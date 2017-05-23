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

        this.identifierClass = 'text-area-component';
    }

    renderContent() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.state.label;
        }

        return (
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

