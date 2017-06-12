import React from 'react';
import PropTypes from 'prop-types';
import TabContentComponent from '../common/TabContentComponent';
import CompanyTrustComponent from './CompanyTrustComponent';
import CompanyPrivacyComponent from './CompanyPrivacyComponent';
import CompanyGeneralComponent from './CompanyGeneralComponent';
import CompanyResponsibleLendComponent from './CompanyResponsibleLendComponent';
import CompanyOtherIncomeListComponent from './CompanyOtherIncomeListComponent';
import CompanyContactComponent from './CompanyContactComponent';

export default function CompanyComponent(props) {
    return (
        <TabContentComponent
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

CompanyComponent.propTypes = {
    model: PropTypes.object.isRequired
};
