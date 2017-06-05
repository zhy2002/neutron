import React from 'react';
import NotificationSystem from 'react-notification-system';
import EventService from '../neutron/EventService';
import LodgementService from './services/LodgementService';
import LocationService from './services/LocationService';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementContentComponent from './LodgementContentComponent';
import LodgementFooterComponent from './LodgementFooterComponent';
import LodgementSpinnerComponent from './LodgementSpinnerComponent';
import LenderListComponent from './LenderListComponent';


/**
 * Root component of the example application.
 */
export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onStateChange = () => {
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

        this.showLenderList = ({resolve, reject}) => {
            this.setState({
                showLenderList: true,
                handleSelectLender: (lender) => {
                    resolve(lender);
                    this.setState({
                        showLenderList: false,
                        handleSelectLender: null,
                        handleCancelSelectLender: null
                    });
                },
                handleCancelSelectLender: () => {
                    reject();
                    this.setState({
                        showLenderList: false,
                        handleSelectLender: null,
                        handleCancelSelectLender: null
                    });
                }
            });
        };

        this.state = LodgementService.getState();
    }

    componentDidMount() {
        EventService.subscribe('lodgement_state_change', this.onStateChange);
        LocationService.syncStateToHash();
        LodgementService.refreshApplicationList();
        EventService.subscribe('show_lender_list', this.showLenderList);
    }

    componentWillUnmount() {
        EventService.unsubscribe('lodgement_state_change', this.onStateChange);
        EventService.unsubscribe('show_lender_list', this.showLenderList);
    }

    render() {
        const tabItems = [this.state.globalUiStateNode.getAppManagerNode(), ...this.state.openApps];
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
                {
                    this.state.showLenderList &&
                    <LenderListComponent
                        onSelect={this.state.handleSelectLender}
                        onQuit={this.state.handleCancelSelectLender}
                    />
                }
            </div>
        );
    }

}
