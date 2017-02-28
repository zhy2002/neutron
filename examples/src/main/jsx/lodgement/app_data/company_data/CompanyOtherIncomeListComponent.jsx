import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class CompanyOtherIncomeListComponent extends NeutronComponent {

    render() {
        return (
            <div className="company-other-income-list-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
