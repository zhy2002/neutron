import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import ExistingMortgageComponent from './ExistingMortgageComponent';

function ExistingMortgageListComponent({model, disabled, componentClass}) {
    if (disabled)
        return <div/>;

    return (
        <AddListComponent className={componentClass} model={model} itemComponent={ExistingMortgageComponent}/>
    );
}

export default NeutronHoc(
    ExistingMortgageListComponent,
    (model) => {
        const props = {};
        props.disabled = model.isEffectivelyDisabled();
        return props;
    }
);
