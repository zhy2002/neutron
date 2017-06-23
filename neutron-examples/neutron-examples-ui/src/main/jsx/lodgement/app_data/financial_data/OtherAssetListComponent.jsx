import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';
import OtherAssetComponent from './OtherAssetComponent';


function OtherAssetListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={OtherAssetComponent}
        />
    );
}

export default NeutronHoc(OtherAssetListComponent);
