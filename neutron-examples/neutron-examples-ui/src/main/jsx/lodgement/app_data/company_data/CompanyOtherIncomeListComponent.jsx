import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import CompanyOtherIncomeComponent from './CompanyOtherIncomeComponent';
import AddListComponent from '../common/AddListComponent';
import MainContentComponent from '../common/MainContentComponent';


export default class PersonOtherIncomeListComponent extends ListNeutronComponent {

    renderItems() {
        const items = [];
        this.model.getChildren().forEach((item) => {
            items.push(<CompanyOtherIncomeComponent key={item.getUniqueId()} model={item}/>);
        });
        return items;
    }

    render() {
        return (
            <MainContentComponent className="person-other-income-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}
