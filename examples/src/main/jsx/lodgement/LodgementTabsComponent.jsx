import React from 'react';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';

export default class LodgementTabsComponent extends React.PureComponent {

    render() {
        return (
            <div className="lodgement-tabs-component">
                <NavPillsComponent
                    items={this.props.tabItems}
                    selectedIndex={this.props.selectedIndex}
                    onSelect={this.props.selectTab}
                    onClose={this.props.closeTab}
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
