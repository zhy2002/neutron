import React from 'react';
import DatePicker from 'material-ui/DatePicker';
import InputComponent from './InputComponent';
import FieldErrorMessageComponent from './FieldErrorMessageComponent';

export default class DateInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        const newState = super.extractNewState();

        const value = this.model.getValue();
        newState.date = value ? new Date(value) : null;

        return newState;
    }

    render() {
        const model = this.model;

        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <DatePicker
                        id={this.id}
                        autoOk
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.date}
                        onChange={(event, date) => {
                            if (date) {
                                model.setValue(date.toUTCString());
                            } else {
                                model.setValue('');
                            }
                        }}
                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}
