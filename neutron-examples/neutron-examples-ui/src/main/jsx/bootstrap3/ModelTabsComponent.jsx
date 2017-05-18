import React from 'react';
import ListNeutronComponent from './ListNeutronComponent';
import NavPillsComponent from './NavPillsComponent';

export default class ModelTabsComponent extends ListNeutronComponent {

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
            <div className="model-tabs-component">
                <NavPillsComponent
                    items={tabItems}
                    selectedItem={this.state.selectedItem}
                    onSelect={this.selectTab}
                    large
                />
            </div>
        );
    }
}

