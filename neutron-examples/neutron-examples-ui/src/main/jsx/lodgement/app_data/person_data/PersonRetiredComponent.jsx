import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MonthYearComponent from '../common/MonthYearComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';

function PersonRetiredComponent(props) {
    const model = props.model;

    if (model.isEffectivelyDisabled())
        return null;

    return (
        <div className={`${props.componentClass} container-fluid`}>
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

export default NeutronHoc(PersonRetiredComponent);
