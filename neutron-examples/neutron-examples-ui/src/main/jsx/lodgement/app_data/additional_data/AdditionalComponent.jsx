import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RelatedPartyListComponent from './RelatedPartyListComponent';
import MainContentComponent from '../common/MainContentComponent';

function AdditionalComponent(props) {
    return (
        <MainContentComponent className={props.componentClass}>
            <RelatedPartyListComponent model={props.model.getRelatedPartyListNode()}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(AdditionalComponent);
