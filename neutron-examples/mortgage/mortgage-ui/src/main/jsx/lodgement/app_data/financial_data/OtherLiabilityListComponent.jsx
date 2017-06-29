import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';
import OtherLiabilityComponent from './OtherLiabilityComponent';


function OtherLiabilityListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={OtherLiabilityComponent}
        />
    );
}

export default NeutronHoc(OtherLiabilityListComponent);
