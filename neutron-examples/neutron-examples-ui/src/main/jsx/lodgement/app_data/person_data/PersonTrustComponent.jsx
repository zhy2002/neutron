import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TrustComponent from '../common/TrustComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class PersonTrustComponent extends NeutronComponent {

    render() {
        return (
            <MainContentComponent className="person-trust-component">
                <TrustComponent model={this.model} />
            </MainContentComponent>
        );
    }
}
