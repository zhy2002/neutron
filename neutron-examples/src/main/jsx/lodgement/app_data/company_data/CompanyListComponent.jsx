import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyListComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-list-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
