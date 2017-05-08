import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import AddListComponent from '../common/AddListComponent';
import PersonSummaryComponent from './PersonSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';
import CommonUtil from '../../services/CommonUtil';


export default class PersonListComponent extends ListNeutronComponent {

    componentDidMount() {
        CommonUtil.delay(10).then(
            () => {
                if (this.model.getItemCount() === 0) {
                    this.model.createItem();
                }
            }
        );
    }

    render() {
        return (
            <MainContentComponent className="person-list-component">
                <AddListComponent model={this.model}>
                    {
                        this.model.getChildren().map(
                            item => <PersonSummaryComponent key={item.getUniqueId()} model={item}/>
                        )
                    }
                </AddListComponent>
            </MainContentComponent>
        );
    }
}
