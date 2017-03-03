import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyContactComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-contact-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
