import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import OtherLiabilityComponent from './OtherLiabilityComponent';

function createItemComponent(item) {
    return <OtherLiabilityComponent key={item.getUniqueId()} model={item}/>;
}

export default class OtherLiabilityListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent
                title="Other Liabilities"
                model={this.model}
                createItemComponent={createItemComponent}
            />
        );
    }
}
