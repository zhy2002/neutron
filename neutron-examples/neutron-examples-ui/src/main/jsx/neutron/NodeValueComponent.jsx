import React from 'react';
import NeutronHoc from './NeutronHoc';

function NodeValueComponent(props) {
    return <span>{props.prefix}{props.text}</span>;
}

export default NeutronHoc(
    NodeValueComponent,
    (model) => {
        const props = {};
        props.text = `${model.getValue()}`;
        if (model.getCurrencyInfo) {
            props.prefix = model.getCurrencyInfo().getSymbol();
        } else {
            props.prefix = '';
        }
        return props;
    }
);
