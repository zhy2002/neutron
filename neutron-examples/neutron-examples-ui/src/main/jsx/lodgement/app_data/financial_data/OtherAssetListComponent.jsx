import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import OtherAssetComponent from './OtherAssetComponent';

function createItemComponent(item) {
    return <OtherAssetComponent key={item.getUniqueId()} model={item}/>;
}

function OtherAssetListComponent(props) {
    return (
        <SimpleListComponent
            className={props.componentClass}
            title="Other Assets"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(OtherAssetListComponent);
