import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import BooleanVisibleRowComponent from '../../../bootstrap3/BooleanVisibleRowComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import ProductCardHolderComponent from './ProductCardHolderComponent';

function getOtherPersonApplicants(existingRefs) {
    return () => {
        const rootNode = existingRefs[0].getContext().getRootNode();
        const personListNode = rootNode.getPersonListNode();
        const existing = existingRefs.map(ref => ref.getReferencedNode());
        const result = [];
        for (let i = 0; i < personListNode.getItemCount(); i++) {
            const person = personListNode.getItem(i);
            if (existing.indexOf(person) < 0) {
                result.push(person);
            }
        }
        return result;
    };
}

function ProductFeatureComponent(props) {
    const model = props.model;
    const refModels = [
        model.getProductPrimaryCardHolderNode().getProductCardHolderNameNode(),
        model.getProductAdditionalCardHolderNode().getProductCardHolderNameNode()
    ];

    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductPackageNameNode()}/>
                </div>
                <div className="col-md-4">
                    <RadioInputComponent model={model.getProductRepaymentFrequencyNode()}/>
                </div>
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getProductRateLockFlagNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getProductTransactionAccountFlagNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getTransactionAccountOptOutReasonNode()}/>
                </div>
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getProduct100PercentOffsetFlagNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getProductCreditCardFlagNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getCreditCardOptOutReasonNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
            <BooleanVisibleRowComponent model={model.getProductCreditCardFlagNode()}>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getProductCreditCardLimitNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getProductCreditCardTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getProductExpressConsentFlagNode()}/>
                </div>
            </BooleanVisibleRowComponent>
            <BooleanVisibleRowComponent model={model.getProductCreditCardFlagNode()}>
                <div className="col-md-12">
                    <ProductCardHolderComponent
                        model={model.getProductPrimaryCardHolderNode()}
                        getPersonApplicants={getOtherPersonApplicants(refModels)}
                    />
                    <ProductCardHolderComponent
                        model={model.getProductAdditionalCardHolderNode()}
                        getPersonApplicants={getOtherPersonApplicants(refModels)}
                    />
                </div>
            </BooleanVisibleRowComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(ProductFeatureComponent);
