import React from 'react';
import PropTypes from 'prop-types';
import ResizeAware from 'react-resize-aware';
import NeutronComponent from '../bootstrap3/NeutronComponent';
import LodgementBannerComponent from './LodgementBannerComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementService from './services/LodgementService';


export default class LodgementHeaderComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            LodgementService.updateHeaderHeight(height);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.siteLogoUrl = this.model.getSiteLogoPath();
        return newState;
    }

    render() {
        const selectedModel = this.props.tabItems[this.props.selectedIndex];

        return (
            <ResizeAware
                className="lodgement-header-component"
                style={{position: 'relative'}}
                onlyEvent
                onResize={this.handleResize}
            >
                <LodgementBannerComponent logoUrl={this.state.siteLogoUrl} />
                <LodgementTabsComponent
                    tabItems={this.props.tabItems}
                    selectedIndex={this.props.selectedIndex}
                    selectTab={LodgementService.selectTab}
                    closeTab={LodgementService.closeTab}
                />
                <LodgementToolbarComponent
                    model={selectedModel}
                    onNewApp={LodgementService.newApp}
                    onOpenApp={LodgementService.openApp}
                    onCloneApp={LodgementService.cloneApp}
                />
            </ResizeAware>
        );
    }
}

LodgementHeaderComponent.propTypes = {
    tabItems: PropTypes.array.isRequired,
    selectedIndex: PropTypes.number.isRequired
};
