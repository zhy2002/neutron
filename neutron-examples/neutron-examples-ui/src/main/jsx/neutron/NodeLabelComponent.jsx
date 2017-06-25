import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from './NeutronHoc';

function NodeLabelComponent({label, dirty, checkDirty}) {
    return <span>{label} {checkDirty && dirty ? ' *' : ' '}</span>;
}

export default NeutronHoc(
    NodeLabelComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        props.dirty = model.isDirty();
        return props;
    },
    {
        checkDirty: PropTypes.bool
    },
    {
        checkDirty: false
    }
);
