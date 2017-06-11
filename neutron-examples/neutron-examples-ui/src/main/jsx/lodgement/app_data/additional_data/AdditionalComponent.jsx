import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RelatedPartyListComponent from './RelatedPartyListComponent';
import MainContentComponent from '../common/MainContentComponent';

function AdditionalComponent(props) {
    return (
        <MainContentComponent className="additional-component">
            <RelatedPartyListComponent model={props.model.getRelatedPartyListNode()}/>
        </MainContentComponent>
    );
}

AdditionalComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(AdditionalComponent);
