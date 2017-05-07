import React from 'react';
import PropTypes from 'prop-types';
import ResizeAware from 'react-resize-aware';
import LodgementBannerComponent from './LodgementBannerComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementService from './services/LodgementService';


export default class LodgementHeaderComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            LodgementService.updateHeaderHeight(height);
        };
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
                <LodgementBannerComponent />
                <LodgementTabsComponent
                    tabItems={this.props.tabItems}
                    selectedIndex={this.props.selectedIndex}
                    selectTab={LodgementService.selectTab}
                    closeTab={LodgementService.closeTab}
                />
                <LodgementToolbarComponent model={selectedModel} onNewApp={LodgementService.newApp}/>
            </ResizeAware>
        );
    }
}

LodgementHeaderComponent.propTypes = {
    tabItems: PropTypes.array.isRequired,
    selectedIndex: PropTypes.number.isRequired
};
