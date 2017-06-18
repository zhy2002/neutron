import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import AddressComponent from '../common/AddressComponent';
import SelectRelatedPersonListComponent from '../common/SelectRelatedPersonListComponent';

function TrustComponent(props) {
    const model = props.model;
    return (
        <div className={`${props.componentClass} container-fluid compact`}>
            <div className="row">
                <div className="col-md-3">
                    <SelectInputComponent model={model.getTrustTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent model={model.getTrustNameNode()}/>
                </div>
                <div className="col-md-3">
                    <DateInputComponent model={model.getTrustRegistrationDateNode()}/>
                </div>
                <div className="col-md-3">
                    <SelectInputComponent model={model.getTrustCountryNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-6">
                    <AddressComponent model={model.getTrustAddressNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent model={model.getTrustSettlorNotRequiredReasonNode()}/>
                </div>
                <div className="col-md-3">
                    <TextInputComponent
                        model={model.getTrustIndustryNode()}
                        searchPath="/lodgement/industry/_search?q=value:{key}&size=10&pretty"
                    />
                </div>
            </div>
            <div className="row">
                <div className="col-md-3">
                    <SelectRelatedPersonListComponent model={model.getTrustBeneficialOwnerListNode()}/>
                </div>
                <div className="col-md-3">
                    <SelectRelatedPersonListComponent model={model.getTrustBeneficiaryListNode()}/>
                </div>
                <div className="col-md-3">
                    <SelectRelatedPersonListComponent model={model.getTrustSettlorListNode()}/>
                </div>
            </div>
        </div>
    );
}

export default NeutronHoc(TrustComponent);
