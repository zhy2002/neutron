import React from 'react';
import MainContentComponent from '../common/MainContentComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';

export default class AccessComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <MainContentComponent className="access-component">
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
}
