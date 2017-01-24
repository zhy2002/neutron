import React from 'react';
import Paper from 'material-ui/Paper';
import NeutronComponent from '../../materialui/NeutronComponent';
import TextInputComponent from '../../materialui/TextInputComponent';
import CheckboxInputComponent from '../../materialui/CheckboxInputComponent';
import DateInputComponent from '../../materialui/DateInputComponent';
import SelectInputComponent from '../../materialui/SelectInputComponent';
import RadioInputComponent from '../../materialui/RadioInputComponent';


const paperMargin = {
    margin: '10px 2px',
    paddingTop: '0.5em'
};

export default class PersonGeneralComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div className="row expanded">
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <SelectInputComponent model={model.getTitleNode()}/>
                        <TextInputComponent model={model.getFirstNameNode()}/>
                        <TextInputComponent model={model.getLastNameNode()}/>
                        <RadioInputComponent model={model.getGenderNode()}/>
                        <DateInputComponent model={model.getDateOfBirthNode()}/>
                        <TextInputComponent label="Driver's License" model={model.getDriversLicenseNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <RadioInputComponent model={model.getApplicantTypeNode()}/>
                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                        <SelectInputComponent model={model.getApplicationTypeNode()}/>
                        <SelectInputComponent model={model.getMaritalStatusNode()}/>
                        <TextInputComponent model={model.getSpouseNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                        <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>
                        <SelectInputComponent model={model.getHousingStatusNode()}/>
                    </Paper>
                </div>
            </div>
        );
    }
}
