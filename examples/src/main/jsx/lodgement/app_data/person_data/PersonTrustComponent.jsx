import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import AddressComponent from '../common/AddressComponent';

export default class PersonTrustComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact person-trust-component">
                <div className="row">
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getPersonTrustTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getPersonTrustNameNode()}/>
                    </div>
                    <div className="col-md-3">
                        <DateInputComponent model={model.getPersonTrustRegistrationDateNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getPersonTrustCountryNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-6">
                        <AddressComponent model={model.getPersonTrustAddressNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getPersonTrustSettlorNotRequiredReasonNode()}/>
                    </div>
                    <div className="col-md-3">
                        <TextInputComponent model={model.getPersonTrustIndustryNode()}/>
                    </div>
                </div>
            </div>
        );
    }
}
