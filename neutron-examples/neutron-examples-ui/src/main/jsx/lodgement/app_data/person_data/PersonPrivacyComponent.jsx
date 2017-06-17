import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PrivacyComponent from '../common/PrivacyComponent';
import MainContentComponent from '../common/MainContentComponent';

function PersonPrivacyComponent(props) {
    return (
        <MainContentComponent className={props.componentClass}>
            <PrivacyComponent model={props.model}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonPrivacyComponent);
