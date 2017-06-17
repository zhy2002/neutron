import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonOtherIncomeComponent from './PersonOtherIncomeComponent';
import MainContentComponent from '../common/MainContentComponent';
import AddListComponent from '../common/AddListComponent';

function PersonOtherIncomeListComponent(props) {
    const model = props.model;
    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model}>
                {model.getChildren().map(
                    item => <PersonOtherIncomeComponent key={item.getUniqueId()} model={item}/>
                )}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
