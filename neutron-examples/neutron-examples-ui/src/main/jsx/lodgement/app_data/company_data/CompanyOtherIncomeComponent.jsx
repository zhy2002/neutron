import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import RemovePanelComponent from '../../../bootstrap3/RemovePanelComponent';

function CompanyOtherIncomeComponent(props) {
    const model = props.model;
    return (
        <RemovePanelComponent model={model} className={props.componentClass}>
            <div className="row">
                <div className="col-md-3">
                    <SelectInputComponent model={model.getOtherIncomeTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <SelectInputComponent model={model.getOtherIncomeAddBackTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getOtherIncomeAmountNode()}/>
                </div>
                <div className="col-md-3">
                    <CheckboxInputComponent model={model.getOtherIncomePreviousYearNode()}/>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(CompanyOtherIncomeComponent);
