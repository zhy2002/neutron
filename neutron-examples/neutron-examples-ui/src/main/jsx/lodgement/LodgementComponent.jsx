import React from 'react';
import NotificationSystem from 'react-notification-system';
import NeutronHoc from '../neutron/NeutronHoc';
import EventService from '../neutron/EventService';
import LodgementService from './services/LodgementService';
import LocationService from './services/LocationService';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementContentComponent from './LodgementContentComponent';
import LodgementFooterComponent from './LodgementFooterComponent';
import LodgementSpinnerComponent from './LodgementSpinnerComponent';
import LenderListComponent from './LenderListComponent';


class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {};

        this.setNotificationSystem = (ref) => {
            this.notificationSystem = ref;
        };

        this.showNotification = (config) => {
            if (this.notificationSystem) {
                this.notificationSystem.addNotification(config);
            } else {
                console.warn('Notification system is not initialized.');
            }
        };

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
    }

    componentDidMount() {
        LocationService.syncStateToHash();
        LodgementService.refreshApplicationList();
        EventService.subscribe('show_notification', this.showNotification);
        EventService.subscribe('show_lender_list', this.showLenderList);
    }

    componentWillUnmount() {
        EventService.unsubscribe('show_notification', this.showNotification);
        EventService.unsubscribe('show_lender_list', this.showLenderList);
    }

    render() {
        const props = this.props;
        const model = props.model;
        const tabItems = [model.getAppManagerNode(), ...props.openApps];
        const selectedModel = tabItems[props.selectedTabIndex];

        return (
            <div className={props.componentClass}>
                <LodgementHeaderComponent
                    model={model.getHeaderNode()}
                    tabItems={tabItems}
                    selectedIndex={props.selectedTabIndex}
                />
                <LodgementContentComponent
                    model={selectedModel}
                    top={props.headerHeight + 2}
                    bottom={props.footerHeight + 1}
                />
                <LodgementFooterComponent />
                <LodgementSpinnerComponent />
                <NotificationSystem ref={this.setNotificationSystem}/>
                <LenderListComponent
                    show={this.state.showLenderList}
                    onSelect={this.state.handleSelectLender}
                    onQuit={this.state.handleCancelSelectLender}
                />
            </div>
        );
    }
}

export default NeutronHoc(
    LodgementComponent,
    (model) => {
        const newState = {};
        newState.footerHeight = model.getFooterHeight();
        newState.headerHeight = model.getHeaderHeight();
        newState.selectedTabIndex = model.getSelectedTabIndex();
        newState.openApps = model.getOpenAppsNode().getChildren().map(c => c.getValue());
        return newState;
    }
);
