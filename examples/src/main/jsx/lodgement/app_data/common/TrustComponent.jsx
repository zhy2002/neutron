import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import AddressComponent from '../common/AddressComponent';

export default class TrustComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact trust-component">
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
                        <TextInputComponent model={model.getTrustIndustryNode()}/>
                    </div>
                </div>
            </div>
        );
    }
}