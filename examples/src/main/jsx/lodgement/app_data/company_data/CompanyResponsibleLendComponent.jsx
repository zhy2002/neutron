import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyResponsibleLendComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-responsible-lend-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
