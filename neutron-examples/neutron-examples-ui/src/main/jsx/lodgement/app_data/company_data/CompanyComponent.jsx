import React from 'react';
import TabContentComponent from '../common/TabContentComponent';
import CompanyTrustComponent from './CompanyTrustComponent';
import CompanyPrivacyComponent from './CompanyPrivacyComponent';
import CompanyGeneralComponent from './CompanyGeneralComponent';
import CompanyResponsibleLendComponent from './CompanyResponsibleLendComponent';
import CompanyOtherIncomeListComponent from './CompanyOtherIncomeListComponent';
import CompanyContactComponent from './CompanyContactComponent';

export default class CompanyComponent extends TabContentComponent {

    renderTabContent(className, model) {
        console.log(`render tab content for ${this.label}`);

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

        return null;
    }

}
