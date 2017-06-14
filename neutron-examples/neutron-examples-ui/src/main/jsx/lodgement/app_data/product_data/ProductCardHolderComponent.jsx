import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CommonUtil from '../../../neutron/CommonUtil';
import ReferenceInputComponent from '../../../bootstrap3/ReferenceInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';

function ProductCardHolderComponent(props) {
    const model = props.model;

    return (
        <div className={`${props.componentClass} row`}>
            <div className="col-md-3">
                <ReferenceInputComponent
                    model={model.getProductCardHolderNameNode()}
                    getOptionNodes={props.getPersonApplicants}
                />
            </div>
            <div className="col-md-3">
                <SelectInputComponent model={model.getProductRewardsProgramNode()}/>
            </div>
            <div className="col-md-3">
                <TextInputComponent model={model.ProductRewardsMembershipNode()}/>
            </div>
            <div className="col-md-3"/>
        </div>
    );
}

ProductCardHolderComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(
    ProductCardHolderComponent,
    CommonUtil.mapToEmptyObject,
    {
        getPersonApplicants: PropTypes.func.isRequired
    }
);
