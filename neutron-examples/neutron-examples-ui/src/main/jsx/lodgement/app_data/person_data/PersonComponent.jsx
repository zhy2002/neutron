import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TabContentComponent from '../common/TabContentComponent';
import PersonGeneralComponent from './PersonGeneralComponent';
import PersonContactComponent from './PersonContactComponent';
import PersonEmploymentListComponent from './PersonEmploymentListComponent';
import PersonTrustComponent from './PersonTrustComponent';
import PersonPrivacyComponent from './PersonPrivacyComponent';
import PersonOtherIncomeListComponent from './PersonOtherIncomeListComponent';
import PersonResponsibleLendComponent from './PersonResponsibleLendComponent';

function PersonComponent(props) {
    return (
        <TabContentComponent
            className={props.componentClass}
            model={props.model}
            renderTabContent={(className, model) => {
                if (className === 'PersonGeneralNode') {
                    return <PersonGeneralComponent model={model}/>;
                }
                if (className === 'PersonContactNode') {
                    return <PersonContactComponent model={model}/>;
                }
                if (className === 'CurrentEmploymentListNode') {
                    return <PersonEmploymentListComponent model={model}/>;
                }
                if (className === 'PreviousEmploymentListNode') {
                    return <PersonEmploymentListComponent model={model}/>;
                }
                if (className === 'PersonTrustNode') {
                    return <PersonTrustComponent model={model}/>;
                }
                if (className === 'PersonPrivacyNode') {
                    return <PersonPrivacyComponent model={model}/>;
                }
                if (className === 'PersonOtherIncomeListNode') {
                    return <PersonOtherIncomeListComponent model={model}/>;
                }
                if (className === 'PersonResponsibleLendNode') {
                    return <PersonResponsibleLendComponent model={model}/>;
                }

                return null;
            }}
        />
    );
}

export default NeutronHoc(PersonComponent);
