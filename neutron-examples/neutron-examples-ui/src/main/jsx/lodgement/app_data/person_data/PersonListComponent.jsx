import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import PersonSummaryComponent from './PersonSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class PersonListComponent extends ListNeutronComponent {

    componentDidMount() {
        setTimeout(() => {
            if (this.model.getItemCount() === 0) {
                this.model.createItem();
            }
        }, 10);
    }

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

