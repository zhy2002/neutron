import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import CreditCardComponent from './CreditCardComponent';
import SimpleListComponent from '../common/SimpleListComponent';

function createItemComponent(item) {
    return <CreditCardComponent key={item.getUniqueId()} model={item}/>;
}

export default class CreditCardListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Credit Cards" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
