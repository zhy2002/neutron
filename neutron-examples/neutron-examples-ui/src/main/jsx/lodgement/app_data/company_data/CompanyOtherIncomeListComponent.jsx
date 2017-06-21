import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AlertInfoComponent from '../common/AlertInfoComponent';
import CompanyOtherIncomeComponent from './CompanyOtherIncomeComponent';
import AddListComponent from '../common/AddListComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const items = model.getChildren().map(
        item => <CompanyOtherIncomeComponent key={item.getUniqueId()} model={item}/>
    );
    if (items.length === 0) {
        items.push(
            <AlertInfoComponent>
                Click <em>Add</em> to create a new other income record.
            </AlertInfoComponent>
        );
    }
    return items;
}

function PersonOtherIncomeListComponent(props) {
    const {model, componentClass} = props;
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent model={model}>
                {renderItems(model)}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
