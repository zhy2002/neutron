import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import PersonEmploymentComponent from './PersonEmploymentComponent';
import AddListComponent from '../common/AddListComponent';
import MainContentComponent from '../common/MainContentComponent';


export default class PersonEmploymentListComponent extends ListNeutronComponent {

    renderItems() {
        const items = [];
        this.model.getChildren().forEach((item) => {
            items.push(<PersonEmploymentComponent key={item.getUniqueId()} model={item}/>);
        });
        return items;
    }

    render() {
        return (
            <MainContentComponent className="person-employment-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}
