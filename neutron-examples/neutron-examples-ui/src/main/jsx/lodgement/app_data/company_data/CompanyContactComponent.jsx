import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import MainContentComponent from '../common/MainContentComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';

export default class CompanyContactComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <MainContentComponent className="company-contact-component">
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getCompanyContactFirstNameNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getCompanyContactLastNameNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getWorkPhoneNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getCompanyMobileNumberNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getCompanyEmailNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getFaxNumberNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <AddressComponent model={model.getRegisteredAddressNode()}/>
                    </div>
                    <div className="col-md-4">
                        <AddressComponent model={model.getPostalAddressNode()}/>
                    </div>
                    <div className="col-md-4">
                        <AddressComponent model={model.getTradingAddressNode()}/>
                    </div>
                </div>
                <div className="row small-gap">
                    <div className="col-md-4">
                        <AddressComponent model={model.getPrincipalPlaceAddressNode()}/>
                    </div>
                    <div className="col-md-8"/>
                </div>
            </MainContentComponent>
        );
    }
}
