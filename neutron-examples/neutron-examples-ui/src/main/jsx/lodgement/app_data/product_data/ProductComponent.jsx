import React from 'react';
import PropTypes from 'prop-types';
import TabContentComponent from '../common/TabContentComponent';
import ProductDescriptionComponent from './ProductDescriptionComponent';
import ProductFeaturesComponent from './ProductFeaturesComponent';


export default function ProductComponent(props) {
    return (
        <TabContentComponent
            model={props.model}
            renderTabContent={(className, model) => {
                if (className === 'ProductDescriptionNode') {
                    return <ProductDescriptionComponent model={model}/>;
                }
                if (className === 'ProductFeaturesNode') {
                    return <ProductFeaturesComponent model={model}/>;
                }
                return null;
            }}
        />
    );
}

ProductComponent.propTypes = {
    model: PropTypes.object.isRequired
};
