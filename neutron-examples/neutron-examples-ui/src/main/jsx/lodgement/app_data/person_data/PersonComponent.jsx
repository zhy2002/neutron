import React from 'react';
import TabContentComponent from '../common/TabContentComponent';
import PersonGeneralComponent from './PersonGeneralComponent';
import PersonContactComponent from './PersonContactComponent';
import PersonEmploymentListComponent from './PersonEmploymentListComponent';
import PersonTrustComponent from './PersonTrustComponent';
import PersonPrivacyComponent from './PersonPrivacyComponent';
import PersonOtherIncomeListComponent from './PersonOtherIncomeListComponent';
import PersonResponsibleLendComponent from './PersonResponsibleLendComponent';

export default class PersonComponent extends TabContentComponent {

    renderTabContent(className, model) {
        console.log(`render tab content for person ${this.state.label}`);

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
    }
}
