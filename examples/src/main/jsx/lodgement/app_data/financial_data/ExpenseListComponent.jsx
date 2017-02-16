import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import ExpenseComponent from './ExpenseComponent';

function createItemComponent(item) {
    return <ExpenseComponent key={item.getUniqueId()} model={item}/>;
}

export default class ExpenseListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Expenses" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
