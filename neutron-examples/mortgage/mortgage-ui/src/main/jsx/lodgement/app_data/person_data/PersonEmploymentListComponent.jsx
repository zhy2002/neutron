import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PersonEmploymentComponent from './PersonEmploymentComponent';
import AddListComponent from '../../../bootstrap3/AddListComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';


function PersonEmploymentListComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={model} itemComponent={PersonEmploymentComponent}/>
        </MainContentComponent>
    );
}

export default NeutronHoc(PersonEmploymentListComponent);
