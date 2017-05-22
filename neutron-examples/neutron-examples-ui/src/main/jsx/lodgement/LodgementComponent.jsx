import React from 'react';
import NotificationSystem from 'react-notification-system';
import EventService from '../neutron/EventService';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementContentComponent from './LodgementContentComponent';
import LodgementFooterComponent from './LodgementFooterComponent';
import LodgementSpinnerComponent from './LodgementSpinnerComponent';
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
            try {
                this.setState(LodgementService.getState());
            } catch (e) {
                console.debug(e);
            }
        };

        this.setNotificationSystem = (ref) => {
            this.notificationSystem = ref;
        };

        EventService.subscribe('show_notification', (config) => {
            if (this.notificationSystem) {
                this.notificationSystem.addNotification(config);
            } else {
                console.warn('Notification system is not initialized.');
            }
        });

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
                <LodgementHeaderComponent tabItems={tabItems} selectedIndex={this.state.selectedIndex}/>
                {
                    !isNaN(this.state.headerHeight) &&
                    !isNaN(this.state.footerHeight) &&
                    <LodgementContentComponent
                        model={selectedModel}
                        top={this.state.headerHeight + 2}
                        bottom={this.state.footerHeight + 1}
                    />
                }
                <LodgementFooterComponent />
                <LodgementSpinnerComponent />
                <NotificationSystem ref={this.setNotificationSystem}/>
            </div>
        );
    }

}
