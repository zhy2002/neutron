import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CreditCardComponent from './CreditCardComponent';
import SimpleListComponent from '../common/SimpleListComponent';

function createItemComponent(item) {
    return <CreditCardComponent key={item.getUniqueId()} model={item}/>;
}

function CreditCardListComponent(props) {
    return (
        <SimpleListComponent
            className={props.componentClass}
            title="Credit Cards"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(CreditCardListComponent);
