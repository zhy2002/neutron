import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import OtherAssetComponent from './OtherAssetComponent';

function createItemComponent(item) {
    return <OtherAssetComponent key={item.getUniqueId()} model={item}/>;
}

export default class OtherAssetListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Other Assets" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
