import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../../../bootstrap3/AddListComponent';
import RelatedPartySummaryComponent from './RelatedPartySummaryComponent';


function RelatedPartyListComponent({model, componentClass}) {
    return (
        <AddListComponent
            className={componentClass}
            model={model}
            itemComponent={RelatedPartySummaryComponent}
        />
    );
}

export default NeutronHoc(RelatedPartyListComponent);
