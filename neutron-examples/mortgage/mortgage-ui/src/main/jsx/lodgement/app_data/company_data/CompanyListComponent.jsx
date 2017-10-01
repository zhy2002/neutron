import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../../../bootstrap3/AddListComponent';
import CompanySummaryComponent from './CompanySummaryComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';

function CompanyListComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model} itemComponent={CompanySummaryComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(CompanyListComponent);
