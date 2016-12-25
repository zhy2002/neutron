import React from "react";
import Paper from "material-ui/Paper";
import DatePicker from 'material-ui/DatePicker';
import SelectField from 'material-ui/SelectField';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import TextInputComponent from "../../materialui/TextInputComponent.jsx";
import CheckboxInputComponent from "../../materialui/CheckboxInputComponent.jsx";

const paperMargin = {
    margin: "10px 2px"
};

export default class PersonDataComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }


    render() {
        let model = this.model;

        return (
            <div className="row expanded">
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <TextInputComponent model={model.getTitleNode()} />
                        <TextInputComponent model={model.getFirstNameNode()} />
                        <TextInputComponent model={model.getLastNameNode()} />

                        <div className="row material-field">
                            <div className="medium-12 columns">
                                <DatePicker fullWidth={true} floatingLabelText="Date Of Birth"/>
                            </div>
                        </div>

                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                        <TextInputComponent label="Driver's License" model={model.getDriversLicenseNode()} />
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

                        <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                        <TextInputComponent model={model.getSpouseNode()} />

                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>

                        <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>

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