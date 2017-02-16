import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import SavingsAccountComponent from './SavingsAccountComponent';

function createItemComponent(item) {
    return <SavingsAccountComponent key={item.getUniqueId()} model={item}/>;
}

export default class SavingAccountListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Savings Accounts" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
