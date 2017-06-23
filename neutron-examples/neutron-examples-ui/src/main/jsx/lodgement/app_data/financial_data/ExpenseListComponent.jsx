import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';
import ExpenseComponent from './ExpenseComponent';


function ExpenseListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={ExpenseComponent}
        />
    );
}

export default NeutronHoc(ExpenseListComponent);
