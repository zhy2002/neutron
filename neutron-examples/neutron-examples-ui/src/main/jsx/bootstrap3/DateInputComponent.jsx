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

        this.identifierClass = 'date-input-component';
    }

    getUiValue() {
        const value = this.model.getValue();
        console.log(value);
        return value ? moment(value) : null;
    }

    renderContent() {
        const model = this.props.model;
        return (
            <DatePicker
                id={model.getUniqueId()}
                className="form-control"
                onChange={this.updateValue}
                selected={this.state.value}
                showMonthDropdown
                showYearDropdown
                dropdownMode="select"
                disabled={this.state.disabled}
                readonly={this.state.readonly}
            />
        );
    }
}
