import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';

export default class SavingsAccountComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <FinancialItemComponent model={model}>
                <div className="row">
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getSavingsTypeNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getSavingsInstitutionNameNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getSavingsBalanceNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getSavingsBsbNoNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getSavingsAccountNoNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getSavingsAccountNameNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}
