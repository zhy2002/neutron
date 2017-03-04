import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import ResponsibleLendComponent from '../common/ResponsibleLendComponent';

export default class PersonResponsibleLendComponent extends NeutronComponent {

    render() {
        return (
            <ResponsibleLendComponent model={this.model}/>
        );
    }
}
