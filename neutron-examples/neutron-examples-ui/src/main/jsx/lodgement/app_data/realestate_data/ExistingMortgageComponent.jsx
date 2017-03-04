import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import RemovePanelComponent from '../common/RemovePanelComponent';

export default class ExistingMortgageComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <RemovePanelComponent className="existing-mortgage-component" model={this.model}>
                <div className="row">
                    <div className="col-xs-6">
                        <TextInputComponent model={model.getMortgageLenderInstitutionNode()}/>
                    </div>
                    <div className="col-xs-6">
                        <NumberInputComponent model={model.getMortgqageUnpaidBalanceNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-xs-6">
                        <NumberInputComponent model={model.getMortgageLimitAmountNode()}/>
                    </div>
                    <div className="col-xs-6">
                        <NumberInputComponent model={model.getMortgageMonthlyRepaymentNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-xs-6">
                        <NumberInputComponent model={model.getMortgageBorrowerRateNode()}/>
                    </div>
                    <div className="col-xs-6">
                        <TextInputComponent model={model.getMortgageLoanTypeNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-xs-12">
                        <RadioInputComponent model={model.getMortgageClearingFlagNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-xs-6">
                        <NumberInputComponent model={model.getMortgageBreakFeeNode()}/>

                    </div>
                    <div className="col-xs-6">
                        <TextInputComponent model={model.getMortgageChargePositionNode()}/>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }
}
