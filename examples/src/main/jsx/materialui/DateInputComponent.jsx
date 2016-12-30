import React from 'react';
import DatePicker from 'material-ui/DatePicker';
import {red500} from 'material-ui/styles/colors';

import InputComponent from './InputComponent.jsx';
import FieldErrorMessageComponent from './FieldErrorMessageComponent.jsx';

export default class DateInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        let value = this.model.getValue();
        if(value) {
            newState.date = new Date(value);
        } else {
            newState.date = null;
        }

        if(newState.errorMessage) {
            newState.style.color = red500;
        }

        return newState;
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <DatePicker
                        autoOk={true}
                        fullWidth={true}
                        floatingLabelText={this.state.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.date}
                        onChange={(event, date) => {
                            if(date) {
                                this.model.setValue(date.toUTCString());
                            } else {
                                this.model.setValue("");
                            }
                        }}

                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage} />
                </div>
            </div>
        );
    }

}