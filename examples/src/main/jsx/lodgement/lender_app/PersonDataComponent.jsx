import React from "react";
import Paper from "material-ui/Paper";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import TextInputComponent from "../../materialui/TextInputComponent.jsx";
import CheckboxInputComponent from "../../materialui/CheckboxInputComponent.jsx";
import DateInputComponent from "../../materialui/DateInputComponent.jsx";
import SelectInputComponent from "../../materialui/SelectInputComponent.jsx";


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
                        <TextInputComponent model={model.getTitleNode()}/>
                        <TextInputComponent model={model.getFirstNameNode()}/>
                        <TextInputComponent model={model.getLastNameNode()}/>
                        <DateInputComponent model={model.getDateOfBirthNode()}/>
                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                        <TextInputComponent label="Driver's License" model={model.getDriversLicenseNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <SelectInputComponent model={model.getApplicantTypeNode()}/>
                        <SelectInputComponent model={model.getApplicationTypeNode()}/>
                        <SelectInputComponent model={model.getMaritalStatusNode()}/>
                        <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                        <TextInputComponent model={model.getSpouseNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>
                        <SelectInputComponent model={model.getHousingStatusNode()}/>
                    </Paper>
                </div>
            </div>
        );
    }

}