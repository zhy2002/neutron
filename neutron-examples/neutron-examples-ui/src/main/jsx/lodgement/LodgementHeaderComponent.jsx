import React from 'react';
import PropTypes from 'prop-types';
import ResizeAware from 'react-resize-aware';
import NeutronHoc from '../neutron/NeutronHoc';
import LodgementBannerComponent from './LodgementBannerComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementService from './services/LodgementService';


class LodgementHeaderComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            LodgementService.updateHeaderHeight(height);
        };
    }

    render() {
        const props = this.props;
        const selectedModel = props.tabItems[props.selectedIndex];

        return (
            <ResizeAware
                className={props.componentClass}
                style={{position: 'relative'}}
                onlyEvent
                onResize={this.handleResize}
            >
                <LodgementBannerComponent logoUrl={props.siteLogoUrl}/>
                <LodgementTabsComponent
                    tabItems={props.tabItems}
                    selectedIndex={props.selectedIndex}
                    selectTab={LodgementService.selectTab}
                    closeTab={LodgementService.closeTab}
                />
                <LodgementToolbarComponent
                    model={selectedModel}
                    onNewApp={LodgementService.newApp}
                    onOpenApp={LodgementService.openApp}
                    onCloneApp={LodgementService.cloneApp}
                    onDeleteApp={LodgementService.deleteApp}
                />
            </ResizeAware>
        );
    }
}

export default NeutronHoc(
    LodgementHeaderComponent,
    (model) => {
        const newState = {};
        newState.siteLogoUrl = model.getSiteLogoPath();
        return newState;
    },
    {
        tabItems: PropTypes.array.isRequired,
        selectedIndex: PropTypes.number.isRequired
    }
);
