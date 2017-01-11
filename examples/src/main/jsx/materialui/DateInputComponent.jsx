import React from 'react';
import DatePicker from 'material-ui/DatePicker';
import InputComponent from './InputComponent';
import FieldErrorMessageComponent from './FieldErrorMessageComponent';

export default class DateInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event, date) => {
            const value = date ? date.toUTCString() : '';
            this.model.setValue(value);
        };
    }

    getUiValue() {
        const value = this.model.getValue();
        return value ? new Date(value) : null;
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <DatePicker
                        id={this.id}
                        autoOk
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={this.updateValue}
                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}
