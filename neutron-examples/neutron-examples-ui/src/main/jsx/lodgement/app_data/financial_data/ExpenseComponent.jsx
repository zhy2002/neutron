import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


export default class ExpenseComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <FinancialItemComponent model={model} className="expense-component">
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
}
