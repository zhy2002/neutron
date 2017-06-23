import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import ProductSummaryComponent from './ProductSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

function mapItemToModel(item) {
    return item.getProductDescriptionNode();
}

function ProductListComponent({model, componentClass}) {
    return (
        <MainContentComponent className={componentClass}>
            <AddListComponent
                model={model}
                itemComponent={ProductSummaryComponent}
                mapItemToModel={mapItemToModel}
            />
        </MainContentComponent>
    );
}

export default NeutronHoc(ProductListComponent);
