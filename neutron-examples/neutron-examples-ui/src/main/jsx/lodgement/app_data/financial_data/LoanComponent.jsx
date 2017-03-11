import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import FinancialItemComponent from './FinancialItemComponent';

export default class LoanComponent extends NeutronComponent {

    render() {
        const model = this.model;
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
}
