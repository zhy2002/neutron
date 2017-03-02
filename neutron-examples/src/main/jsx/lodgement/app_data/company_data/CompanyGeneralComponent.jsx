import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyGeneralComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-general-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
