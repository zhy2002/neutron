import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonOtherIncomeComponent from './PersonOtherIncomeComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import AddListComponent from '../../../bootstrap3/AddListComponent';


function PersonOtherIncomeListComponent({model, componentClass}) {
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent model={model} itemComponent={PersonOtherIncomeComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
