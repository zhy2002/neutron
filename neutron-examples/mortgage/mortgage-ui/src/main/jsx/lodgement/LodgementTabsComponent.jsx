import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';

function LodgementTabsComponent(props) {
    const items = props.tabItems;

    return (
        <div className="lodgement-tabs-component">
            <NavPillsComponent
                items={items}
                selectedItem={items[props.selectedIndex]}
                onSelect={(item) => {
                    props.selectTab(items.indexOf(item));
                }}
                onClose={(item) => {
                    props.closeTab(items.indexOf(item));
                }}
            />
        </div>
    );
}

export default NeutronHoc(
    LodgementTabsComponent,
    (model, receivedProps) => {
        const props = {};
        props.tabItems = [
            receivedProps.appManagerNode,
            ...model.getChildren().map(c => c.getValue())
        ];
        return props;
    },
    {
        selectedIndex: PropTypes.number.isRequired,
        appManagerNode: PropTypes.object.isRequired,
        selectTab: PropTypes.func.isRequired,
        closeTab: PropTypes.func.isRequired
    }
);
