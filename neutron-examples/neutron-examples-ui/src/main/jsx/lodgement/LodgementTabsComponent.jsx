import React from 'react';
import PropTypes from 'prop-types';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';

export default function LodgementTabsComponent(props) {
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

LodgementTabsComponent.propTypes = {
    selectedIndex: PropTypes.number.isRequired,
    tabItems: PropTypes.array.isRequired,
    selectTab: PropTypes.func.isRequired,
    closeTab: PropTypes.func.isRequired
};
