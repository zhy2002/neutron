import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonEmploymentComponent from './PersonEmploymentComponent';
import AddListComponent from '../common/AddListComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const items = model.getChildren().map(
        item => <PersonEmploymentComponent key={item.getUniqueId()} model={item}/>
    );

    if (items.length === 0) {
        items.push(
            <div key="no_result" className="alert alert-info">
                <span>Click <em>Add</em> to create a record.</span>
            </div>
        );
    }
    return items;
}

function PersonEmploymentListComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model}>
                {renderItems(model)}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonEmploymentListComponent);
