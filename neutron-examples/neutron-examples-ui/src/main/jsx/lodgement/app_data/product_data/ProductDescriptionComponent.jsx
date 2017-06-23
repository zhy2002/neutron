import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import SelectAccountHolderListComponent from '../common/SelectAccountHolderListComponent';


function ProductDescriptionComponent(props) {
    const model = props.model;
    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductGroupNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductNameNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductLoanPrimaryPurposeNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <NumberInputComponent model={model.getProductRequestedAmountNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductPaymentTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductLendingPurposeNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <NumberInputComponent model={model.getProductTotalLoanTermNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getProductInterestOnlyTermNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getProductFixedTermNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <ul className="list-group">
                        <li className="list-group-item">
                            <CheckboxInputComponent model={model.getProductConstructionApplicationFlagNode()}/>
                        </li>
                        <li className="list-group-item">
                            <CheckboxInputComponent model={model.getProductCostRecuctionFlagNode()}/>
                        </li>
                        <li className="list-group-item">
                            <CheckboxInputComponent model={model.getProductConsolidationFlagNode()}/>
                        </li>
                        <li className="list-group-item">
                            <CheckboxInputComponent model={model.getProductDissatisfactionFlagNode()}/>
                        </li>
                        <li className="list-group-item">
                            <CheckboxInputComponent model={model.getProductSpecificFeaturesFlagNode()}/>
                        </li>
                    </ul>
                </div>
                <div className="col-md-4">
                    <SelectAccountHolderListComponent model={model.getProductAccountHolderListNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(ProductDescriptionComponent);
