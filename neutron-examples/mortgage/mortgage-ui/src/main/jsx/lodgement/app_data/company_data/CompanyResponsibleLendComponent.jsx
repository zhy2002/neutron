import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import ResponsibleLendComponent from '../common/ResponsibleLendComponent';

function CompanyResponsibleLendComponent(props) {
    return (
        <ResponsibleLendComponent model={props.model}/>
    );
}

export default NeutronHoc(CompanyResponsibleLendComponent);
