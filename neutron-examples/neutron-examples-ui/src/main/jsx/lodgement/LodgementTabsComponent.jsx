import React from 'react';
import PropTypes from 'prop-types';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';

export default class LodgementTabsComponent extends React.PureComponent {

    render() {
        const items = this.props.tabItems;
        return (
            <div className="lodgement-tabs-component">
                <NavPillsComponent
                    items={items}
                    selectedItem={items[this.props.selectedIndex]}
                    onSelect={(item) => {
                        this.props.selectTab(items.indexOf(item));
                    }}
                    onClose={(item) => {
                        this.props.closeTab(items.indexOf(item));
                    }}
                />
            </div>
        );
    }
}

LodgementTabsComponent.propTypes = {
    selectedIndex: PropTypes.number.isRequired,
    tabItems: PropTypes.array.isRequired,
    selectTab: PropTypes.func.isRequired,
    closeTab: PropTypes.func.isRequired
};
