import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


export default class OtherAssetComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <FinancialItemComponent model={model} className="other-asset-component">
                <div className="row">
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getOtherAssetTypeNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TextInputComponent model={model.getOtherAssetDescriptionNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getOtherAssetMarketValueNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}
