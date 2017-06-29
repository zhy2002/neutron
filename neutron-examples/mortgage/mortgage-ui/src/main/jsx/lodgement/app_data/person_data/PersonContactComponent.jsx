import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MonthYearComponent from '../common/MonthYearComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';

function PersonContactComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className="person-contact-component">
            <div className="row">
                <div className="col-md-4">
                    <TelephoneComponent model={model.getHomePhoneNode()}/>
                </div>
                <div className="col-md-4">
                    <TelephoneComponent model={model.getWorkPhoneNode()}/>
                </div>
                <div className="col-md-4">
                    <TelephoneComponent model={model.getFaxNumberNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <TextInputComponent model={model.getPersonMobileNumberNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getPersonEmailNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <AddressComponent model={model.getCurrentAddressNode()}/>
                </div>
                <div className="col-md-4">
                    <AddressComponent model={model.getPostalAddressNode()}/>
                </div>
                <div className="col-md-4">
                    <AddressComponent model={model.getPreviousAddressNode()}/>
                </div>
            </div>
            <div className="row small-gap">
                <div className="col-md-4">
                    <MonthYearComponent model={model.getMovedToCurrentAddressNode()}/>
                </div>
                <div className="col-md-4"/>
                <div className="col-md-4">
                    <MonthYearComponent model={model.getMovedToPreviousAddressNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-8"/>
                <div className="col-md-4">
                    <MonthYearComponent model={model.getMovedFromPreviousAddressNode()}/>
                </div>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonContactComponent);
