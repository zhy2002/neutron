import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../../../bootstrap3/AddListComponent';
import ProductSummaryComponent from './ProductSummaryComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';

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
