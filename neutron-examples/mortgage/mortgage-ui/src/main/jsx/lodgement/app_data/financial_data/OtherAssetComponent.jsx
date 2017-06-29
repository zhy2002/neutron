import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


function OtherAssetComponent(props) {
    const model = props.model;

    return (
        <FinancialItemComponent model={model} className={props.componentClass}>
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

export default NeutronHoc(OtherAssetComponent);
