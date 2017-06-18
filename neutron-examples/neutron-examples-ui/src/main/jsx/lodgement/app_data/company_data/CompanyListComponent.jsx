import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import CompanySummaryComponent from './CompanySummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const result = [];
    model.getChildren().map(
        item => <CompanySummaryComponent key={item.getUniqueId()} model={item}/>
    );

    if (result.length === 0) {
        result.push(<div key="no_result" className="alert alert-info">No company in this application.</div>);
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
