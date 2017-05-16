import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import ProductListComponent from './ProductListComponent';

export default class ProductsComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div className="products-component container-fluid">
                <div className="row">
                    <div className="col-md-3">
                        <TextInputComponent model={model.getProductLoanTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getProductTotalSecurityAmountNode()}/>
                    </div>
                    <div className="col-md-3"/>
                    <div className="col-md-3"/>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getProductTotalLoanAmountNode()}/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getProductTotalLoanLmiAmountNode()}/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getProductTotalLvrNode()}/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getProductTotalLvrLmiNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-12">
                        <ProductListComponent model={model.getProductListNode()} />
                    </div>
                </div>
            </div>
        );
    }
}
