import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TrustComponent from '../common/TrustComponent';

function CompanyTrustComponent(props) {
    return (
        <div className={props.componentClass}>
            <TrustComponent model={props.model}/>
        </div>
    );
}

export default NeutronHoc(CompanyTrustComponent);
