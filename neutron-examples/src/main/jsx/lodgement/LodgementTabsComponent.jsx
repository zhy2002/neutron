import React from 'react';
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
    selectedIndex: React.PropTypes.number.isRequired,
    tabItems: React.PropTypes.array.isRequired,
    selectTab: React.PropTypes.func.isRequired,
    closeTab: React.PropTypes.func.isRequired
};
