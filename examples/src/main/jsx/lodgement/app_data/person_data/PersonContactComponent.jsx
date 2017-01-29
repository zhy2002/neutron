import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MonthYearComponent from '../common/MonthYearComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
// import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
// import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
// import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
// import DateInputComponent from '../../../bootstrap3/DateInputComponent';

export default class PersonContactComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact person-contact-component">
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
                        <TextInputComponent model={model.getMobileNumberNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getContactEmailNode()}/>
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
            </div>
        );
    }
}
