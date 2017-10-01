import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';
import SavingsAccountComponent from './SavingsAccountComponent';


function SavingAccountListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={SavingsAccountComponent}
        />
    );
}

export default NeutronHoc(SavingAccountListComponent);
