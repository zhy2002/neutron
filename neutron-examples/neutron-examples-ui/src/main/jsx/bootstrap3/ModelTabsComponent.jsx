import React from 'react';
import NeutronHoc from '../neutron/NeutronHoc';
import NavPillsComponent from './NavPillsComponent';

class ModelTabsComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.selectTab = (item) => {
            this.props.model.setSelectedName(item.getName());
        };
    }

    render() {
        const model = this.props.model;
        const tabItems = model.getChildren();

        return (
            <div className="model-tabs-component">
                <NavPillsComponent
                    items={tabItems}
                    selectedItem={this.props.selectedItem}
                    onSelect={this.selectTab}
                    large
                />
            </div>
        );
    }
}

export default NeutronHoc(
    ModelTabsComponent,
    (model) => {
        const props = {};
        const selectedName = model.getSelectedName();
        props.selectedItem = model.getChildByName(selectedName);
        return props;
    }
);
