import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from './NeutronHoc';

function BooleanLabelComponent(props) {
    if (props.value === true) {
        return <span>{props.trueLabel}</span>;
    } else if (props.value === false) {
        return <span>{props.falseLabel}</span>;
    }
    return null;
}

export default NeutronHoc(
    BooleanLabelComponent,
    (model) => {
        const props = {};
        props.value = model.getValue();
        return props;
    },
    {
        trueLabel: PropTypes.string,
        falseLabel: PropTypes.string
    },
    {
        trueLabel: '',
        falseLabel: ''
    }
);
