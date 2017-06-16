import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import OtherLiabilityComponent from './OtherLiabilityComponent';

function createItemComponent(item) {
    return <OtherLiabilityComponent key={item.getUniqueId()} model={item}/>;
}

function OtherLiabilityListComponent(props) {
    return (
        <SimpleListComponent
            title="Other Liabilities"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(OtherLiabilityListComponent);
