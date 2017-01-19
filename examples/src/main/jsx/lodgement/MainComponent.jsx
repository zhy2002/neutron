import React from 'react';
import NavPillsComponent from '../bootstrap3/NavPillsComponent';
import AppToolbarComponent from './AppToolbarComponent';
import AppBodyComponent from './AppBodyComponent';
//import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
//import ApplicationListComponent from './app_manager/ApplicationListComponent';
//import LenderApplicationComponent from './lender_app/LenderApplicationComponent';

// function createApplicationNode() {
//     return window.GWT.ApplicationNodeFactory.create();
// }

function sizeFunc() {
    return 0;
}

export default class MainComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            openApps: [],
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (selectedIndex) => {
            window.alert(`hahaha ${selectedIndex}`);
        };

        this.onNewApp = () => {
            window.alert('todo create new app');
        };

        // this.createNewApp = () => {
        //     const existingTabs = this.state.openApps;
        //     if (existingTabs.length >= 5) {
        //         window.alert('Cannot open more tabs!');
        //         return;
        //     }
        //
        //     const newApp = {
        //         model: createApplicationNode()
        //     };
        //
        //     const openApps = [...existingTabs, newApp];
        //     this.setState({
        //         openApps,
        //         currentTab: `${openApps.length}`
        //     });
        // };
    }

    // renderAppTabs() {
    //     const appTabs = [];
    //     for (let i = 0; i < this.state.openApps.length; i++) {
    //         const app = this.state.openApps[i];
    //         const tabNumber = `${i + 1}`;
    //         const tabTitle = `App ${tabNumber}`;
    //         appTabs.push(
    //             <Tab key={tabNumber} label={tabTitle} value={tabNumber}>
    //                 <LenderApplicationComponent model={app.model}/>
    //             </Tab>
    //         );
    //     }
    //     return appTabs;
    // }
    render() {
        const dummyAppNode = {
            getNodeLabel: function getNodeLabel() {
            },
            getUniqueId: () => 'n111',
            getName: () => 'dummy',
            getValidationErrorList: function getValidationErrorList() {
                return {size: sizeFunc};
            },
            addChangeListener: function addChangeListener() {
            },
            removeChangeListener: function removeChangeListener() {
            },
            getRequired: () => false,
            hasValue: () => false
        };
        const tabItems = [
            {name: 'Application Manager', model: {}},
            {name: 'NAB', model: dummyAppNode},
            {name: 'Suncorp', model: dummyAppNode}
        ];
        const selectedModel = tabItems[this.state.selectedIndex].model;
        return (
            <div className="app-content">
                <div className="content-container">
                    <div className="content-header">
                        <NavPillsComponent
                            items={tabItems}
                            selectedIndex={this.state.selectedIndex}
                            onSelect={this.selectTab}
                            onClose={this.closeTab}
                        />
                    </div>
                    <div className="content-header">
                        <AppToolbarComponent model={selectedModel} onNewApp={this.onNewApp}/>
                    </div>
                    <div className="content-body">
                        <AppBodyComponent items={tabItems} selectedIndex={this.state.selectedIndex}/>
                    </div>
                </div>
            </div>
        );
        //<p>Parent count is: {this.state.count}</p>
        //<button onClick={this.doChange}>Change</button>
        //<AppManagerComponent/>
        //const appTabs = this.renderAppTabs();

        // return (
        //     <div>
        //         <Tabs
        //             value={this.state.currentTab}
        //             onChange={this.selectTab}
        //         >
        //             <Tab label="Application Manager" value="0" key="0">
        //                 <AppManagerToolbarComponent onNewApp={this.createNewApp}/>
        //                 <ApplicationListComponent />
        //             </Tab>
        //             {appTabs}
        //         </Tabs>
        //     </div>
        // );
    }
}
