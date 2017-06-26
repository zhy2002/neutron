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
        const {componentClass, appManagerNode, openAppsNode, selectedModel, selectedIndex, siteLogoUrl} = this.props;

        return (
            <ResizeAware
                className={componentClass}
                style={{position: 'relative'}}
                onlyEvent
                onResize={this.handleResize}
            >
                <LodgementBannerComponent logoUrl={siteLogoUrl}/>
                <LodgementTabsComponent
                    appManagerNode={appManagerNode}
                    model={openAppsNode}
                    selectedIndex={selectedIndex}
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
        appManagerNode: PropTypes.object.isRequired,
        openAppsNode: PropTypes.object.isRequired,
        selectedModel: PropTypes.object.isRequired,
        selectedIndex: PropTypes.number.isRequired
    }
);
