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


function getAppPath() {
    const hash = window.location.hash;
    if (hash.indexOf('#/app/') === 0) {
        const path = hash.substr(6);
        const index = path.indexOf('/');
        if (index >= 0) {
            return path.substr(index + 1);
        }
    }
    return undefined;
}
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

        this.refreshApplication = (model) => {
            const id = model.getIdNode().getValue();

            LodgementService.loadApplicationNode(id, getAppPath()).then((newModel) => {
                props.model.dispatchAddOpenAppAction(newModel);
                newModel.getContext().setDirtyCheckEnabled(true);
                EventService.fire(
                    'show_notification',
                    {
                        message: 'Application is refreshed.',
                        position: 'tc',
                        level: 'success'
                    }
                );
            });
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
        EventService.subscribe('refresh_application', this.refreshApplication);
    }

    componentWillUnmount() {
        EventService.unsubscribe('show_notification', this.showNotification);
        EventService.unsubscribe('show_lender_list', this.showLenderList);
        EventService.unsubscribe('refresh_application', this.refreshApplication);
    }

    render() {
        const props = this.props;
        const model = props.model;

        return (
            <div className={props.componentClass}>
                <LodgementHeaderComponent
                    model={model.getHeaderNode()}
                    appManagerNode={model.getAppManagerNode()}
                    openAppsNode={model.getOpenAppsNode()}
                    selectedModel={props.selectedModel}
                    selectedIndex={props.selectedTabIndex}
                />
                <LodgementContentComponent
                    model={props.selectedModel}
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
        const props = {};
        props.footerHeight = model.getFooterHeight();
        props.headerHeight = model.getHeaderHeight();
        props.selectedTabIndex = model.getSelectedTabIndex();
        props.selectedModel = props.selectedTabIndex === 0 ?
            model.getAppManagerNode() :
            model.getOpenAppsNode().getItem(props.selectedTabIndex - 1).getValue();
        return props;
    }
);
