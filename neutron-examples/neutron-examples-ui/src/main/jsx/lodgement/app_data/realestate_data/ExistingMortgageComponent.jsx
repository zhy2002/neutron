import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import RemovePanelComponent from '../../../bootstrap3/RemovePanelComponent';

function ExistingMortgageComponent(props) {
    const model = props.model;
    return (
        <RemovePanelComponent className={props.componentClass} model={model}>
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
                    <SelectInputComponent model={model.getMortgageLoanTypeNode()}/>
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
                    <SelectInputComponent model={model.getMortgageChargePositionNode()}/>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(ExistingMortgageComponent);
