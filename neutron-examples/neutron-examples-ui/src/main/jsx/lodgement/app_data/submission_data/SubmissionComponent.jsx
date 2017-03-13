import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class SubmissionComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <MainContentComponent className="submission-component">
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getBrokerFirstNameNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getBrokerLastNameNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getBrokerCompanyNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getContactNumberNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getFaxNumberNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getMobileNumberNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getBrokerEmailNode()}/>
                    </div>
                    <div className="col-md-4">
                        <AddressComponent model={model.getBrokerAddressNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getLenderIssuedBrokerNumberNode()}/>
                    </div>
                </div>
            </MainContentComponent>
        );
    }
}
