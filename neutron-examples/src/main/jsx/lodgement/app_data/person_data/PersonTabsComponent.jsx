import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import NavPillsComponent from '../../../bootstrap3/NavPillsComponent';

export default class PersonTabsComponent extends ListNeutronComponent {

    constructor(props) {
        super(props);

        this.selectTab = (item) => {
            this.model.setSelectedName(item.getName());
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        const selectedName = this.model.getSelectedName();
        newState.selectedItem = this.model.getChildByName(selectedName);

        return newState;
    }

    render() {
        const model = this.model;
        const tabItems = model.getChildren();

        return (
            <div className="person-tabs-component">
                <NavPillsComponent
                    items={tabItems}
                    selectedItem={this.state.selectedItem}
                    onSelect={this.selectTab}
                />
            </div>
        );
    }
}