import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TrustComponent from '../common/TrustComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';

function PersonTrustComponent(props) {
    return (
        <MainContentComponent className={props.componentClass}>
            <TrustComponent model={props.model}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonTrustComponent);
