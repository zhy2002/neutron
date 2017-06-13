import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';


function ProductCustomerContributionEditorComponent(props) {
    const model = props.model;

    return (
        <div className="row">
            <div className="col-sm-12">
                <div className="row">
                    <div className="col-sm-12">
                        <SelectInputComponent model={model.getContributionTypeNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-sm-12">
                        <TextInputComponent model={model.getContributionDescriptionNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-sm-12">
                        <NumberInputComponent model={model.getContributionAmountNode()}/>
                    </div>
                </div>
            </div>
        </div>
    );
}

ProductCustomerContributionEditorComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(ProductCustomerContributionEditorComponent);
