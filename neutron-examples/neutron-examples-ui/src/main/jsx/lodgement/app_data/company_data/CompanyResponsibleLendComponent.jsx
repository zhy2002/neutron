import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import ResponsibleLendComponent from '../common/ResponsibleLendComponent';

export default class CompanyResponsibleLendComponent extends NeutronComponent {

    render() {
        return (
            <ResponsibleLendComponent model={this.model}/>
        );
    }
}
