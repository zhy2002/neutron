import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import ExistingMortgageComponent from './ExistingMortgageComponent';

function ExistingMortgageListComponent(props) {
    const model = props.model;

    if (props.disabled)
        return null;

    return (
        <AddListComponent model={model}>
            {
                model.getChildren().map(
                    item => <ExistingMortgageComponent key={item.getUniqueId()} model={item}/>
                )
            }
        </AddListComponent>
    );
}

ExistingMortgageListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(ExistingMortgageListComponent);
