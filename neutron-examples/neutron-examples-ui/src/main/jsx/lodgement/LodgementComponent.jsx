import React from 'react';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementContentComponent from './LodgementContentComponent';
import LodgementService from './services/LodgementService';
import LocationService from './services/LocationService';
import UiService from './services/UiService';


/**
 * Root component of the example application.
 */
export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onHashChanged = () => {
            this.setState(LodgementService.getState());
        };

        this.state = LodgementService.getState();
    }

    componentDidMount() {
        LodgementService.addHashChangeHandler(this.onHashChanged);
        LocationService.syncStateToHash();
        UiService.refreshApplicationList();
    }

    componentWillUnmount() {
        LodgementService.removeHashChangeHandler(this.onHashChanged);
    }

    render() {
        const tabItems = [this.state.lodgementNode.getAppManagerNode(), ...this.state.openApps];
        const selectedModel = tabItems[this.state.selectedIndex];
        return (
            <div className="lodgement-component">
                <LodgementHeaderComponent />
                <LodgementTabsComponent
                    tabItems={tabItems}
                    selectedIndex={this.state.selectedIndex}
                    selectTab={LodgementService.selectTab}
                    closeTab={LodgementService.closeTab}
                />
                <LodgementToolbarComponent model={selectedModel} onNewApp={LodgementService.newApp}/>
                <LodgementContentComponent model={selectedModel} onLoadApp={LodgementService.loadApp}/>
                <div className="loading-spinner-component hide">
                    <div id="floatingBarsG">
                        <i className="fa fa-circle-o-notch fa-spin fa-3x fa-fw"/>
                        <span className="sr-only">Loading...</span>
                    </div>
                </div>
            </div>
        );
    }
}
