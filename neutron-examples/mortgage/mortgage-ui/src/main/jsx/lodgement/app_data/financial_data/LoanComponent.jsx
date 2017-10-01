import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import FinancialItemComponent from './FinancialItemComponent';

function LoanComponent(props) {
    const model = props.model;

    return (
        <FinancialItemComponent model={model} className="loan-component">
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getLoanTypeNode()}/>
                </div>
                <div className="col-md-8">
                    <TextInputComponent model={model.getLoanLenderNameNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <NumberInputComponent model={model.getLoanLimitAmountNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getLoanOwingAmountNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getLoanMonthlyRepaymentNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getLoanClearingFlagNode()}/>
                </div>
                <div className="col-md-8">
                    <NumberInputComponent model={model.getLoanBreakCostNode()}/>
                </div>
            </div>
        </FinancialItemComponent>
    );
}

export default NeutronHoc(LoanComponent);
