import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import NavPillsComponent from '../../../bootstrap3/NavPillsComponent';

export default class PersonTabsComponent extends NeutronComponent {

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
