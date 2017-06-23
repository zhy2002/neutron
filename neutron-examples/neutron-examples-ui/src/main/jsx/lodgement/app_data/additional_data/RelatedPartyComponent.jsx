import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';


function RelatedPartyComponent(props) {
    const model = props.model;
    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getThirdPartyTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getThirdPartyDescriptionNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getThirdPartyTitleNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getThirdPartyFirstNameNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getThirdPartyLastNameNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <DateInputComponent model={model.getThirdPartyDobNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getThirdPartyCompanyNameNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getThirdPartyEmailNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <AddressComponent model={model.getThirdPartyAddressNode()}/>
                </div>
                <div className="col-md-4">
                    <TelephoneComponent model={model.getThirdPartyWorkPhoneNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(RelatedPartyComponent);
