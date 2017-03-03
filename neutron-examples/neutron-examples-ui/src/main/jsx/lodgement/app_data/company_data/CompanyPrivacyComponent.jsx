import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PrivacyComponent from '../common/PrivacyComponent';

export default class CompanyPrivacyComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-privacy-component">
                <PrivacyComponent model={this.model}/>
            </div>
        );
    }
}
