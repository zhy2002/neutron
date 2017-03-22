import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import ReferenceInputComponent from '../../../bootstrap3/ReferenceInputComponent';
import MainContentComponent from '../common/MainContentComponent';


export default class PersonGeneralComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.getOtherPersonApplicants = () => {
            const result = [];
            const me = this.model.getParent();
            const list = me.getParent();
            for (let i = 0; i < list.getItemCount(); i++) {
                const person = list.getItem(i);
                if (person !== me) {
                    result.push(person);
                }
            }
            return result;
        };
    }

    render() {
        const model = this.props.model;
        return (
            <MainContentComponent className="person-general-component">
                <div className="row">
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getPersonApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getApplicationTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-3">
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
                        <ReferenceInputComponent
                            model={model.getSpouseNode()}
                            getOptionNodes={this.getOtherPersonApplicants}
                        />
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getHousingStatusNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                    </div>
                    <div className="col-md-6"/>
                </div>
            </MainContentComponent>
        );
    }
}
