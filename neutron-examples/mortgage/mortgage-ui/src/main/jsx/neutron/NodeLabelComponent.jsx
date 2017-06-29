import React from 'react';
import PropTypes from 'prop-types';
import {translate} from 'react-i18next';
import NeutronHoc from './NeutronHoc';

function NodeLabelComponent({label, dirty, checkDirty, t}) {
    return <span>{t(label)} {checkDirty && dirty ? ' *' : ' '}</span>;
}

export default translate()(
    NeutronHoc(
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
            checkDirty: true
        }
    )
);

