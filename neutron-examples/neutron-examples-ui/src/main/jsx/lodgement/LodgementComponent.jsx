import React from 'react';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementContentComponent from './LodgementContentComponent';
import LocationService from './services/LocationService';


export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        console.log('constructing lodgement component');
        this.state = LocationService.getState();

        this.onHashChanged = () => {
            this.setState(LocationService.getState());
        };
        LocationService.addHashChangeHandler(this.onHashChanged);

        LocationService.restoreLocation();
    }

    componentWillUnmount() {
        LocationService.removeHashChangeHandler(this.onHashChanged);
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
                    selectTab={LocationService.selectTab}
                    closeTab={LocationService.closeTab}
                />
                <LodgementToolbarComponent model={selectedModel} onNewApp={LocationService.newApp}/>
                <LodgementContentComponent model={selectedModel} onLoadApp={LocationService.loadApp}/>
            </div>
        );
    }
}
