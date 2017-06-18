import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CompanyOtherIncomeComponent from './CompanyOtherIncomeComponent';
import AddListComponent from '../common/AddListComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const items = model.getChildren().map(
        item => <CompanyOtherIncomeComponent key={item.getUniqueId()} model={item}/>
    );
    return items;
}

function PersonOtherIncomeListComponent(props) {
    const model = props.model;
    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model}>
                {renderItems(model)}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
