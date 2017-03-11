import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import FinancialItemComponent from './FinancialItemComponent';

export default class OtherLiabilityComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <FinancialItemComponent model={model} className="other-liability-component">
                <div className="row">
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getOtherLiabilityTypeNode()}/>
                    </div>
                    <div className="col-md-8">
                        <TextInputComponent model={model.getOtherLiabilityDescriptionNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getOtherLiabilityLimitAmountNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getOtherLiabilityAmountOwningNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getOtherLiabilityMonthlyRepaymentNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <CheckboxInputComponent model={model.getOtherLiabilityClearingFlagNode()}/>
                    </div>
                    <div className="col-md-8">
                        <NumberInputComponent model={model.getOtherLiabilityBreakCostNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}
