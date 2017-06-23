import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonOtherIncomeComponent from './PersonOtherIncomeComponent';
import MainContentComponent from '../common/MainContentComponent';
import AddListComponent from '../common/AddListComponent';


function PersonOtherIncomeListComponent({model, componentClass}) {
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent model={model} itemComponent={PersonOtherIncomeComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
