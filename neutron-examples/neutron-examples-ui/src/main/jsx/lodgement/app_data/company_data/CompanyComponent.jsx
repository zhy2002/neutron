import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TabContentComponent from '../../../bootstrap3/TabContentComponent';
import CompanyTrustComponent from './CompanyTrustComponent';
import CompanyPrivacyComponent from './CompanyPrivacyComponent';
import CompanyGeneralComponent from './CompanyGeneralComponent';
import CompanyResponsibleLendComponent from './CompanyResponsibleLendComponent';
import CompanyOtherIncomeListComponent from './CompanyOtherIncomeListComponent';
import CompanyContactComponent from './CompanyContactComponent';

function CompanyComponent(props) {
    return (
        <TabContentComponent
            className={props.componentClass}
            model={props.model}
            renderTabContent={
                (className, model) => {
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
        />
    );
}

export default NeutronHoc(CompanyComponent);
