import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import MonthYearComponent from '../common/MonthYearComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';

export default class PersonRetiredComponent extends NeutronComponent {

    render() {
        const model = this.model;
        if (model.isEffectivelyDisabled())
            return null;

        return (
            <div className="container-fluid person-retired-component">
                <div className="row">
                    <div className="col-md-6">
                        <RadioInputComponent model={model.getRetiredOnBenefitFlagNode()}/>
                    </div>
                    <div className="col-md-6">
                        <MonthYearComponent model={model.getRetiredSinceNode()}/>
                    </div>
                </div>
            </div>
        );
    }
}
