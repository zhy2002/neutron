import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TrustComponent from '../common/TrustComponent';

export default class CompanyTrustComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-trust-component">
                <TrustComponent model={this.model}/>
            </div>
        );
    }
}
