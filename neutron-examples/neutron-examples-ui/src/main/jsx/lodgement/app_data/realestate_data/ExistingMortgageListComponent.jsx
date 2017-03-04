import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import ExistingMortgageComponent from './ExistingMortgageComponent';

export default class ExistingMortgageListComponent extends ListNeutronComponent {

    renderItems() {
        const items = [];
        this.model.getChildren().forEach((item) => {
            items.push(<ExistingMortgageComponent key={item.getUniqueId()} model={item}/>);
        });
        return items;
    }

    render() {
        return (
            <AddListComponent model={this.model}>
                {this.renderItems()}
            </AddListComponent>
        );
    }
}
