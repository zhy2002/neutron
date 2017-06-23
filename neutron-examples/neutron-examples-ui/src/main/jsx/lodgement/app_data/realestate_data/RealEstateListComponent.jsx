import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import RealEstateSummaryComponent from './RealEstateSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';


function RealEstateListComponent({model, componentClass}) {
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent model={model} itemComponent={RealEstateSummaryComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(RealEstateListComponent);
