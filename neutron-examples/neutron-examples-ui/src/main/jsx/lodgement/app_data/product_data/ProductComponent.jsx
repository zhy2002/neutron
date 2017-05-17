import React from 'react';
import TabContentComponent from '../common/TabContentComponent';
import ProductDescriptionComponent from './ProductDescriptionComponent';
import ProductFeaturesComponent from './ProductFeaturesComponent';


export default class ProductComponent extends TabContentComponent {

    renderTabContent(className, model) {
        console.log(`render tab content for product ${this.state.label}`);

        if (className === 'ProductDescriptionNode') {
            return <ProductDescriptionComponent model={model}/>;
        }
        if (className === 'ProductFeaturesNode') {
            return <ProductFeaturesComponent model={model}/>;
        }

        return null;
    }
}
