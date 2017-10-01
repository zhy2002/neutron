import React from 'react';
import PropTypes from 'prop-types';
import TabContentComponent from '../../../bootstrap3/TabContentComponent';
import UsageComponent from './UsageComponent';
import PropertyComponent from './PropertyComponent';
import AccessComponent from './AccessComponent';

export default function RealEstateComponent(props) {
    return (
        <TabContentComponent
            model={props.model}
            renderTabContent={(className, model) => {
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
            }}
        />
    );
}

RealEstateComponent.propTypes = {
    model: PropTypes.object.isRequired
};
