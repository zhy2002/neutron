import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import SavingsAccountComponent from './SavingsAccountComponent';

function createItemComponent(item) {
    return <SavingsAccountComponent key={item.getUniqueId()} model={item}/>;
}

function SavingAccountListComponent(props) {
    return (
        <SimpleListComponent
            title="Savings Accounts"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(SavingAccountListComponent);
