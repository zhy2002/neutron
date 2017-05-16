import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RelatedPartyListComponent from './RelatedPartyListComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class AdditionalComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <MainContentComponent className="additional-component">
                <RelatedPartyListComponent model={model.getRelatedPartyListNode()}/>
            </MainContentComponent>
        );
    }
}
