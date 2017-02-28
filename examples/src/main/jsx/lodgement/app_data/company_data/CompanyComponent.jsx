import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
