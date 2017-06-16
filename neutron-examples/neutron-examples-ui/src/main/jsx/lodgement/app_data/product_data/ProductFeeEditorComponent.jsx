import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';


function ProductFeeEditorComponent(props) {
    const model = props.model;

    return (
        <div className={`${props.componentClass} row`}>
            <div className="col-sm-12">
                <div className="row">
                    <div className="col-sm-12">
                        <SelectInputComponent model={model.getFeeTypeNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-sm-12">
                        <TextInputComponent model={model.getFeeDescriptionNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-sm-12">
                        <SelectInputComponent model={model.getFeePayFromNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-sm-12">
                        <NumberInputComponent model={model.getFeeAmountNode()}/>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default NeutronHoc(ProductFeeEditorComponent);
