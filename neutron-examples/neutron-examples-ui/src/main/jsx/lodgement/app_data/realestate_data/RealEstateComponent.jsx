import React from 'react';
import TabContentComponent from '../common/TabContentComponent';
import UsageComponent from './UsageComponent';
import PropertyComponent from './PropertyComponent';
import AccessComponent from './AccessComponent';

export default class RealEstateComponent extends TabContentComponent {

    renderTabContent(className, model) {
        console.log(`render tab content for Real Estate ${this.state.label}`);

        if (className === 'UsageNode') {
            return <UsageComponent model={model}/>;
        }
        if (className === 'PropertyNode') {
            return <PropertyComponent model={model}/>;
        }
        if (className === 'AccessNode') {
            return <AccessComponent model={model}/>;
        }

        return null;
    }
}
