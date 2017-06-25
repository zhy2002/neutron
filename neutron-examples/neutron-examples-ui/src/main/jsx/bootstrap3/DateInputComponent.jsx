import React from 'react';
import PropTypes from 'prop-types';
import debounce from 'throttle-debounce/debounce';
import DatePicker from 'react-datepicker';
import moment from 'moment';
import InputComponent from './InputComponent';

const dateFormat = 'L';

export default class DateInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.rawValue = undefined; //do not check

        this.updateValue = (value) => {
            this.rawValue = undefined;
            this.model.setValue(value ? value.format() : '');
        };

        this.debouncedNotify = debounce(400, () => {
            this.onNotify();
        });

        this.updateRawValue = (event) => {
            this.rawValue = event.target.value;
            this.debouncedNotify();
        };
    }

    getUiValue() {
        const value = this.model.getValue();
        return value ? moment(value) : null;
    }

    setErrorMessages(newState) {
        super.setErrorMessages(newState);

        if (this.rawValue !== undefined) {
            if (!newState.value && this.rawValue
                || newState.value && newState.value.format(dateFormat) !== this.rawValue
            ) {
                newState.errorMessages.push('Invalid date.');
            }
        }
    }

    renderContent() {
        const model = this.props.model;
        const conditionalProps = {};
        if (this.props.openToDate) {
            conditionalProps.openToDate = this.props.openToDate;
        }
        return (
            <DatePicker
                id={model.getUniqueId()}
                className="form-control"
                onChange={this.updateValue}
                onChangeRaw={this.updateRawValue}
                selected={this.state.value}
                showMonthDropdown
                showYearDropdown
                dropdownMode="select"
                disabled={this.state.disabled}
                readonly={this.state.readonly}
                {...conditionalProps}
            />
        );
    }
}

DateInputComponent.propTypes = {
    openToDate: PropTypes.object
};

DateInputComponent.defaultProps = {
    openToDate: null
};
