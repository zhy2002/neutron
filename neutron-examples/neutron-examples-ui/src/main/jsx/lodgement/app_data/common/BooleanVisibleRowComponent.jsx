import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';


function BooleanVisibleRowComponent(props) {
    if (props.visible) {
        return (
            <div className="row">
                {props.children}
            </div>
        );
    }
    return null;
}

export default NeutronHoc(
    BooleanVisibleRowComponent,
    (model) => {
        const props = {};
        props.visible = model.getValue();
        return props;
    }
);