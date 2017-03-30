import React from 'react';
import 'react-datepicker/dist/react-datepicker.css';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementContentComponent from './LodgementContentComponent';
import CommonUtil from './services/CommonUtil';
import StorageService from './services/StorageService';
import UiService from './services/UiService';

export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            lodgementNode: UiService.getLodgementNode(),
            openApps: [],
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (tabIndex) => {
            const openApps = this.state.openApps;
            const appIndex = tabIndex - 1;
            if (!openApps[appIndex].isDirty() || window.confirm('Are you sure you want to close the application?')) {
                const newApps = [];
                openApps.forEach((item, i) => {
                    if (i === appIndex)
                        return;
                    newApps.push(item);
                });
                let selectedIndex = tabIndex;
                if (selectedIndex > newApps.length) {
                    selectedIndex = newApps.length;
                }
                this.setState({
                    openApps: newApps,
                    selectedIndex
                });
            }
        };

        this.onNewApp = () => {
            const newApp = UiService.createApplicationNode();
            this.createNewApp(newApp);
            return newApp;
        };

        this.createNewApp = (newApp) => {
            const newApps = [...this.state.openApps, newApp];
            this.setState({
                openApps: newApps,
                selectedIndex: newApps.length //there is a appManager node in the front
            });
            CommonUtil.delay(10).then(
                () => {
                    console.log('Enabling dirty check..');
                    newApp.getContext().setDirtyCheckEnabled(true);
                }
            );
        };

        this.onLoadApp = (id) => {
            const openApps = this.state.openApps;
            if (openApps) {
                for (let i = 0; i < openApps.length; i++) {
                    const app = openApps[i];
                    if (app.getIdNode().getValue() === id) {
                        this.selectTab(i + 1);
                        return;
                    }
                }
            }
            CommonUtil.setIsLoading(true);
            StorageService.getApplication(id).then(
                (node) => {
                    const model = UiService.createApplicationNode();
                    const context = model.getContext();
                    context.beginSession();
                    CommonUtil.setValue(model, node);
                    context.commitSession();
                    return model;
                }
            ).then(
                model => CommonUtil.delay().then(() => {
                    this.createNewApp(model);
                    CommonUtil.setIsLoading(false);
                })
            );
        };
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
                    selectTab={this.selectTab}
                    closeTab={this.closeTab}
                />
                <LodgementToolbarComponent model={selectedModel} onNewApp={this.onNewApp}/>
                <LodgementContentComponent model={selectedModel} onLoadApp={this.onLoadApp}/>
            </div>
        );
    }
}
