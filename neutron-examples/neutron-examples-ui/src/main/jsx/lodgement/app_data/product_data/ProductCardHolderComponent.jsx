import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';

function ProductCardHolderComponent(props) {
    return (
        <div className={props.componentClass}>
            ProductCardHolderComponent
        </div>
    );
}

ProductCardHolderComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(ProductCardHolderComponent);
