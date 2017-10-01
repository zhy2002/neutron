import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CompanyOtherIncomeComponent from './CompanyOtherIncomeComponent';
import AddListComponent from '../../../bootstrap3/AddListComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';


function PersonOtherIncomeListComponent({model, componentClass}) {
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent model={model} itemComponent={CompanyOtherIncomeComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonOtherIncomeListComponent);
