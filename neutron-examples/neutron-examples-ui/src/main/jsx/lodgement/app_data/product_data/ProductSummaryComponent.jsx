import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import ModelLinkComponent from '../../../bootstrap3/ModelLinkComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import RemovePanelComponent from '../common/RemovePanelComponent';


function ProductSummaryComponent(props) {
    const model = props.model;
    const parent = model.getParent();

    return (
        <RemovePanelComponent className={props.componentClass} model={parent}>
            <div className="row">
                <div className="col-xs-6">
                    <ModelLinkComponent model={parent} title="Product Name"/>
                </div>
                <div className="col-xs-3">
                    <NumberInputComponent model={model.getProductRequestedAmountNode()} readonly/>
                </div>
                <div className="col-xs-3">
                    <NumberInputComponent model={model.getProductTotalLoanTermNode()} readonly/>
                </div>
            </div>
            <div className="row">
                <div className="col-xs-6">
                    <SelectInputComponent model={model.getProductLoanPrimaryPurposeNode()} readonly/>
                </div>
                <div className="col-xs-6">
                    <SelectInputComponent model={model.getProductLendingPurposeNode()} readonly/>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(ProductSummaryComponent);
