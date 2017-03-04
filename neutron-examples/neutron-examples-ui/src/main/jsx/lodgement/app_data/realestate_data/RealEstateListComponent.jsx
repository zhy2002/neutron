import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import RealEstateSummaryComponent from './RealEstateSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';


export default class RealEstateListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        this.model.getChildren().forEach(
            (item) => {
                result.push(<RealEstateSummaryComponent key={item.getUniqueId()} model={item}/>);
            }
        );
        return result;
    }

    render() {
        return (
            <MainContentComponent className="real-estate-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}
