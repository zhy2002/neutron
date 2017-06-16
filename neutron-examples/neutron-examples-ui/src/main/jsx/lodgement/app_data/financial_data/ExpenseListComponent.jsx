import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import ExpenseComponent from './ExpenseComponent';

function createItemComponent(item) {
    return <ExpenseComponent key={item.getUniqueId()} model={item}/>;
}

function ExpenseListComponent(props) {
    return (
        <SimpleListComponent
            className={props.componentClass}
            title="Expenses"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(ExpenseListComponent);
