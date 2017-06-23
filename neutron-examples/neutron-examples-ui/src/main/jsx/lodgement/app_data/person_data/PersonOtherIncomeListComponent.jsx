import React from 'react';
import AlertInfoComponent from '../common/AlertInfoComponent';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonOtherIncomeComponent from './PersonOtherIncomeComponent';
import MainContentComponent from '../common/MainContentComponent';
import AddListComponent from '../common/AddListComponent';

function renderItems(model) {
    const items = model.getChildren().map(
        item => <PersonOtherIncomeComponent key={item.getUniqueId()} model={item}/>
    );
    if (items.length === 0) {
        items.push(
            <AlertInfoComponent key="no_result">
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
