import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';

export default class PersonGeneralComponent extends NeutronComponent {

    render() {
        const model = this.props.model;
        return (
            <div className="container-fluid compact">
                <div className="row">
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-offset-1 col-md-2">
                        <SelectInputComponent model={model.getTitleNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getFirstNameNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getLastNameNode()}/>
                    </div>
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getGenderNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <DateInputComponent model={model.getDateOfBirthNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getDriversLicenseNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getMaritalStatusNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getSpouseNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getHousingStatusNode()}/>
                    </div>
                    <div className="col-md-6"/>
                </div>
            </div>
        );
    }
}
