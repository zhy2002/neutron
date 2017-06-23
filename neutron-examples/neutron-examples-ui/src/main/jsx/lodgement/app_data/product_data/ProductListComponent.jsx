import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import AlertInfoComponent from '../common/AlertInfoComponent';
import ProductSummaryComponent from './ProductSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

function renderItems(model) {
    const items = model.getChildren().map(item =>
        <ProductSummaryComponent
            key={item.getUniqueId()}
            model={item.getProductDescriptionNode()}
        />
    );
    if (items.length === 0) {
        items.push(
            <AlertInfoComponent key="no_result">
                Click <em>Add</em> to add a new product.
            </AlertInfoComponent>
        );
    }
    return items;
}

function ProductListComponent(props) {
    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={props.model}>
                {renderItems(props.model)}
            </AddListComponent>
        </MainContentComponent>
    );
}

export default NeutronHoc(ProductListComponent);
