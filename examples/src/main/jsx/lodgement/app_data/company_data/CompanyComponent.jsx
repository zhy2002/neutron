import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import CompanyTrustComponent from './CompanyTrustComponent';
import CompanyPrivacyComponent from './CompanyPrivacyComponent';
import CompanyGeneralComponent from './CompanyGeneralComponent';
import CompanyResponsibleLendComponent from './CompanyResponsibleLendComponent';
import CompanyOtherIncomeListComponent from './CompanyOtherIncomeListComponent';
import CompanyContactComponent from './CompanyContactComponent';

export default class CompanyComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();

        const selectedName = this.model.getSelectedName();
        newState.selectedItem = this.model.getChildByName(selectedName);

        return newState;
    }

    renderContent() {
        const model = this.state.selectedItem;
        const className = model.getConcreteClassName();
        if (className === 'CompanyGeneralNode') {
            return <CompanyGeneralComponent model={model}/>;
        }
        if (className === 'CompanyContactNode') {
            return <CompanyContactComponent model={model}/>;
        }
        if (className === 'CompanyTrustNode') {
            return <CompanyTrustComponent model={model}/>;
        }
        if (className === 'CompanyPrivacyNode') {
            return <CompanyPrivacyComponent model={model}/>;
        }
        if (className === 'CompanyOtherIncomeListNode') {
            return <CompanyOtherIncomeListComponent model={model}/>;
        }
        if (className === 'CompanyResponsibleLendNode') {
            return <CompanyResponsibleLendComponent model={model}/>;
        }

        return (
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-12">
                        <em>unknown model type {className}</em>
                    </div>
                </div>
            </div>
        );
    }

    render() {
        return (
            <div className="company-component">
                {this.renderContent()}
            </div>
        );
    }
}
