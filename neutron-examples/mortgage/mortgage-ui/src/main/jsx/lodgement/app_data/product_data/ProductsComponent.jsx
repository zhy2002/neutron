import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import ProductListComponent from './ProductListComponent';

function ProductsComponent(props) {
    const model = props.model;

    return (
        <div className={`${props.componentClass} container-fluid`}>
            <div className="row">
                <div className="col-md-3">
                    <SelectInputComponent model={model.getProductLoanTypeNode()}/>
                </div>
                <div className="col-md-3">
                    <DateInputComponent model={model.getSettlementDateNode()}/>
                </div>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getProductTotalLvrNode()}/>
                </div>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getProductTotalLvrLmiNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-3"/>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getProductTotalLoanAmountNode()}/>
                </div>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getProductTotalSecurityAmountNode()}/>
                </div>
                <div className="col-md-3">
                    <NumberInputComponent model={model.getProductTotalLoanLmiAmountNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-12">
                    <ProductListComponent model={model.getProductListNode()}/>
                </div>
            </div>
        </div>
    );
}

export default NeutronHoc(ProductsComponent);
