import React from 'react';
import NeutronHoc from './NeutronHoc';

function NodeLabelComponent({label}) {
    return <span>{label}</span>;
}

export default NeutronHoc(
    NodeLabelComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        if (model.isDirty()) {
            props.label += ' *';
        } else {
            props.label += '  ';
        }
        return props;
    }
);
