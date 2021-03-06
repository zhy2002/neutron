import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import SelectRelatedPersonListComponent from '../common/SelectRelatedPersonListComponent';


function CompanyGeneralComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-3">
                    <RadioInputComponent model={model.getCompanyApplicantTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <SelectInputComponent model={model.getCompanyApplicationTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <CheckboxInputComponent model={model.getCompanyPrimaryApplicantFlagNode()}/>
                </div>
                <div className="col-md-3"/>
            </div>
            <div className="row">
                <div className="col-md-3">
                    <TextInputComponent model={model.getCompanyRegisteredNameNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent model={model.getCompanyTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent model={model.getCompanyDescriptionNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent
                        model={model.getCompanyIndustryNode()}
                        searchPath="/lodgement/industry/_search?q=value:{key}&size=10&pretty"
                    />
                </div>
            </div>
            <div className="row">
                <div className="col-md-3">
                    <TextInputComponent model={model.getCompanyAbnNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent model={model.getCompanyAbrnNode()}/>
                </div>
                <div className="col-md-3">
                    <DateInputComponent model={model.getCompanyRegistrationDateNode()}/>
                </div>
                <div className="col-md-3"/>
            </div>
            <div className="row">
                <div className="col-md-6">
                    <SelectRelatedPersonListComponent model={model.getCompanySelectDirectorNode()}/>
                </div>
                <div className="col-md-6">
                    <SelectRelatedPersonListComponent model={model.getCompanySelectBeneficialOwnerNode()}/>
                </div>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(CompanyGeneralComponent);
