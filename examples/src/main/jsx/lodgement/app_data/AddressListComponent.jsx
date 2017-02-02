import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import NodeValueComponent from '../../bootstrap3/NodeValueComponent';

export default class AddressListComponent extends NeutronComponent {

    renderItems() {
        const model = this.model;
        const items = [];
        model.getUniqueAddressNodes().forEach(
            (item) => {
                items.push(
                    <div>
                        <div>
                            <NodeValueComponent model={item.getAddressLineNode()}/>
                        </div>
                        <div>
                            <NodeValueComponent model={item.getSuburbNode()}/>
                            <NodeValueComponent model={item.getPostcodeNode()}/>
                            <NodeValueComponent model={item.getCountryNode()}/>
                        </div>
                    </div>
                );
            }
        );
        return items;
    }

    render() {
        return (
            <div className="address-list-component">
                {this.renderItems()}
            </div>
        );
    }

}
