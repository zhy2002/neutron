import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';

function SavingsAccountComponent(props) {
    const model = props.model;
    return (
        <FinancialItemComponent model={model} className="savings-account-component">
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getSavingsTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <TextInputComponent
                        model={model.getSavingsInstitutionNameNode()}
                        searchPath="/lodgement/institution/_search?q=value:{key}&size=10&pretty"
                    />
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

export default NeutronHoc(SavingsAccountComponent);
