import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import CreditHistoryComponent from './CreditHistoryComponent';


export default class CreditHistoryListComponent extends ListNeutronComponent {

    constructor(props) {
        super(props);

        this.createNewItem = () => {
            const item = this.model.createItem();
            //todo rename to afterUpdate or something.
            this.addCallback(() => {
                //todo extract method
                const dom = document.getElementById(item.getUniqueId());
                if (dom && item.focus) {
                    dom.focus();
                }
            });
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.count = this.model.getItemCount();
        return newState;
    }

    renderItems() {
        const items = [];
        this.model.getChildren().forEach((item) => {
            items.push(<CreditHistoryComponent key={item.getUniqueId()} model={item}/>);
        });
        return items;
    }

    render() {
        if (this.state.disabled)
            return null;

        return (
            <div className="credit-history-list-component">
                <div className="row">
                    <div className="col-xs-2">
                        <button className="btn btn-sm btn-primary pull-right" onClick={this.createNewItem}>
                            Add
                        </button>
                    </div>
                    <div className="col-xs-10">
                        Credit Histories ({this.state.count})
                    </div>
                </div>
                {this.renderItems()}
            </div>
        );
    }
}
