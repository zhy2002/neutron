import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


function ExpenseComponent(props) {
    const model = props.model;
    return (
        <FinancialItemComponent model={model} className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getExpenseTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent model={model.getExpenseDescriptionNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getExpenseMonthlyRepaymentNode()}/>
                </div>
            </div>
        </FinancialItemComponent>
    );
}

export default NeutronHoc(ExpenseComponent);
