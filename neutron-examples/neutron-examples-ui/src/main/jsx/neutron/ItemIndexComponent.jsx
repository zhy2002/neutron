import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';

function ItemIndexComponent({index, nodeLabel, itemCount}) {
    return (
        <span className="item-index-component">
                {nodeLabel} ({index + 1} of {itemCount})
        </span>
    );
}

export default NeutronHoc(
    ItemIndexComponent,
    (model) => {
        const props = {};
        props.itemCount = model.getItemCount();
        props.nodeLabel = model.getNodeLabel();
        return props;
    },
    {
        index: PropTypes.number.isRequired
    }
);
