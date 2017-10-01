import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CreditCardComponent from './CreditCardComponent';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';


function CreditCardListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={CreditCardComponent}
        />
    );
}

export default NeutronHoc(CreditCardListComponent);
