import React from 'react';
import DatePicker from 'react-datepicker';
import moment from 'moment';
import InputComponent from './InputComponent';


export default class DateInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (value) => {
            this.model.setValue(value ? value.format() : '');
        };
    }

    getUiValue() {
        const value = this.model.getValue();
        console.log(value);
        return value ? moment(value) : null;
    }

    render() {
        const model = this.props.model;
        return (
            <div className="form-group form-group-sm date-input-component">
                <label htmlFor={model.getUniqueId()}>{this.label}</label>
                <DatePicker
                    className="form-control"
                    onChange={this.updateValue}
                    selected={this.state.value}
                    showMonthDropdown
                    showYearDropdown
                    dropdownMode="select"
                />
            </div>
        );
    }
}
