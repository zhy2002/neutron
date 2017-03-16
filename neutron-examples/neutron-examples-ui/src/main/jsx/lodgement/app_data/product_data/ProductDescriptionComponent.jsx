import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class ProductDescriptionComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <MainContentComponent className="product-description-component">
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
                        todo select applicants
                    </div>
                    <div className="col-md-4"/>
                </div>
            </MainContentComponent>
        );
    }
}
