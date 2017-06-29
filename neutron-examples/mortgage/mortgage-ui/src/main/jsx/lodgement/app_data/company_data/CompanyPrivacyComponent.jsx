import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PrivacyComponent from '../common/PrivacyComponent';

function CompanyPrivacyComponent(props) {
    return (
        <div className={props.componentClass}>
            <PrivacyComponent model={props.model}/>
        </div>
    );
}

export default NeutronHoc(CompanyPrivacyComponent);
