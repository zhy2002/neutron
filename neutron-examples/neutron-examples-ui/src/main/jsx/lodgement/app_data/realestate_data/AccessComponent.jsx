import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';

function AccessComponent(props) {
    const model = props.model;
    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getAccessContactTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getAccessOtherDescriptionNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getAccessContactTitleNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getAccessContactFirstNameNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getAccessContactLastNameNode()}/>
                </div>

            </div>
            <div className="row">
                <div className="col-md-4">
                    <TextInputComponent model={model.getAccessCompanyNameNode()}/>
                </div>
                <div className="col-md-4">
                    <TelephoneComponent model={model.getAccessTelephoneNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(AccessComponent);
