import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import RealEstateSummaryComponent from './RealEstateSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';


function RealEstateListComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model}>
                {
                    model.getChildren().map(
                        item => <RealEstateSummaryComponent key={item.getUniqueId()} model={item}/>
                    )
                }
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(RealEstateListComponent);
