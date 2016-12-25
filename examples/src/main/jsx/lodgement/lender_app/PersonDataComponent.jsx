import React from "react";
import Paper from "material-ui/Paper";
import TextField from "material-ui/TextField";
import DatePicker from 'material-ui/DatePicker';
import Checkbox from 'material-ui/Checkbox';
import SelectField from 'material-ui/SelectField';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";


const paperMargin = {
    margin: "10px 2px"
};

export default class PersonDataComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }


    render() {
        return (
            <div className="row expanded">
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <TextField fullWidth={true} floatingLabelText="Title"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <TextField fullWidth={true} floatingLabelText="First Name"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <TextField fullWidth={true} floatingLabelText="Last Name"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <DatePicker fullWidth={true} floatingLabelText="Date Of Birth"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <Checkbox label="Primary Applicant"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <TextField fullWidth={true} floatingLabelText="Driver's License"/>
                            </div>
                        </div>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <SelectField fullWidth={true} floatingLabelText="Applicant Type"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <SelectField fullWidth={true} floatingLabelText="Application Type"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <SelectField fullWidth={true} floatingLabelText="Marital Status"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <Checkbox label="Permanent Resident"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <TextField fullWidth={true} floatingLabelText="Spouse"/>
                            </div>
                        </div>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <Checkbox label="First Home Buyer"/>
                            </div>
                        </div>
                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <SelectField fullWidth={true} floatingLabelText="Housing Status"/>
                            </div>
                        </div>
                    </Paper>
                </div>
            </div>
        );
    }

}