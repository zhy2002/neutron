import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import ProductSummaryComponent from './ProductSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';


export default class ProductListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        this.model.getChildren().forEach(
            (item) => {
                result.push(<ProductSummaryComponent key={item.getUniqueId()} model={item}/>);
            }
        );
        return result;
    }

    render() {
        return (
            <MainContentComponent className="product-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }

}
