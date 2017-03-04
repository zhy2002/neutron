import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import PersonSummaryComponent from './PersonSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class PersonListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        this.model.getChildren().forEach(
            (item) => {
                result.push(<PersonSummaryComponent key={item.getUniqueId()} model={item}/>);
            }
        );
        return result;
    }

    render() {
        return (
            <MainContentComponent className="person-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}

