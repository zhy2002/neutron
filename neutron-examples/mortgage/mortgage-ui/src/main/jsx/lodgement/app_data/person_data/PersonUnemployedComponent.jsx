import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MonthYearComponent from '../common/MonthYearComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';

function PersonUnemployedComponent(props) {
    const model = props.model;
    if (model.isEffectivelyDisabled())
        return null;

    return (
        <div className="container-fluid person-unemployed-component">
            <div className="row">
                <div className="col-md-6">
                    <RadioInputComponent model={model.getUnemployedOnBenefitFlagNode()}/>
                </div>
                <div className="col-md-6">
                    <RadioInputComponent model={model.getHouseDutiesFlagNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-6">
                    <RadioInputComponent model={model.getStudentFlagNode()}/>
                </div>
                <div className="col-md-6">
                    <SelectInputComponent model={model.getStudentTypeNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-6">
                    <MonthYearComponent model={model.getUnemployedSinceNode()}/>
                </div>
                <div className="col-md-6"/>
            </div>
        </div>
    );
}

export default NeutronHoc(PersonUnemployedComponent);
