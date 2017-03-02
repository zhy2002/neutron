import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TrustComponent from '../common/TrustComponent';

export default class PersonTrustComponent extends NeutronComponent {

    render() {
        return (
            <div className="person-trust-component">
                <TrustComponent model={this.model} />
            </div>
        );
    }
}
