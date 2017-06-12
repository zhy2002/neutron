import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import ProductSummaryComponent from './ProductSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';


function ProductListComponent(props) {
    return (
        <MainContentComponent className={props.componentClass}>
            <AddListComponent model={props.model}>
                {
                    props.model.getChildren().map(item =>
                        <ProductSummaryComponent
                            key={item.getUniqueId()}
                            model={item.getProductDescriptionNode()}
                        />
                    )
                }
            </AddListComponent>
        </MainContentComponent>
    );
}

ProductListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(ProductListComponent);
