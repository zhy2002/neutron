import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import AlertInfoComponent from '../common/AlertInfoComponent';
import CompanySummaryComponent from './CompanySummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const result = model.getChildren().map(
        item => <CompanySummaryComponent key={item.getUniqueId()} model={item}/>
    );

    if (result.length === 0) {
        result.push(
            <AlertInfoComponent key="no_result">
                Click <em>Add</em> to create a new company applicant.
            </AlertInfoComponent>
        );
    }
    return result;
}

function CompanyListComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model}>
                {renderItems(model)}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(CompanyListComponent);
