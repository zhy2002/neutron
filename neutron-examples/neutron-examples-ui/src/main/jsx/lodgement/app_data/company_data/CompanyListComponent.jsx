import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import CompanySummaryComponent from './CompanySummaryComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class CompanyListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        this.model.getChildren().forEach(
            (item) => {
                result.push(<CompanySummaryComponent key={item.getUniqueId()} model={item}/>);
            }
        );

        if (result.length === 0) {
            result.push(<div key="no_result" className="alert alert-info">No company in this application.</div>);
        }
        return result;
    }

    render() {
        return (
            <MainContentComponent className="company-list-component">
                <AddListComponent model={this.model}>
                    {this.renderItems()}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}
