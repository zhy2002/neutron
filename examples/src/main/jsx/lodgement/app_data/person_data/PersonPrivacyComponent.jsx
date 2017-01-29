import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';

export default class PersonPrivacyComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact person-privacy-component">
                <div className="row">
                    <div className="col-md-4">
                        <CheckboxInputComponent model={model.getCreditCheckFlagNode()}/>
                    </div>
                    <div className="col-md-8"/>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <CheckboxInputComponent model={model.getThirdPartyDisclosureFlagNode()}/>
                    </div>
                    <div className="col-md-8"/>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <RadioInputComponent model={model.getLegalActionNode()}/>
                    </div>
                    <div className="col-md-8"/>
                </div>
            </div>
        );
    }
}
