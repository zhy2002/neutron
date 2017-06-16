import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import LoanComponent from './LoanComponent';

function createItemComponent(item) {
    return <LoanComponent key={item.getUniqueId()} model={item}/>;
}

function LoanListComponent(props) {
    return (
        <SimpleListComponent
            className={props.componentClass}
            title="Loans"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(LoanListComponent);
