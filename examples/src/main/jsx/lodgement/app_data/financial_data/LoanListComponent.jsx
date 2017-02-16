import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import LoanComponent from './LoanComponent';

function createItemComponent(item) {
    return <LoanComponent key={item.getUniqueId()} model={item}/>;
}

export default class LoanListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Loans" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
