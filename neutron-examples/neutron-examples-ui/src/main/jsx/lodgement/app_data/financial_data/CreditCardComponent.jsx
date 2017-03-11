import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


export default class CreditCardComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.delete = () => {
            if (window.confirm(`Are you sure you want to remove this ${this.model.getNodeLabel()}`)) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    render() {
        const model = this.model;
        return (
            <FinancialItemComponent model={model} className="credit-card-component">
                <div className="row">
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getCreditCardTypeNode()}/>
                    </div>
                    <div className="col-md-8">
                        <TextInputComponent model={model.getCreditCardLenderNameNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardLimitAmountNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardAmountOwingNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardMonthlyRepaymentNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <CheckboxInputComponent model={model.getCreditCardClearingFlagNode()}/>
                    </div>
                    <div className="col-md-8">
                        <NumberInputComponent model={model.getCreditCardBreakCostNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}
