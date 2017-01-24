import React from 'react';
import 'react-datepicker/dist/react-datepicker.css';
import LodgementHeaderComponent from './LodgementHeaderComponent';
import LodgementTabsComponent from './LodgementTabsComponent';
import LodgementToolbarComponent from './LodgementToolbarComponent';
import LodgementContentComponent from './LodgementContentComponent';

const lenders = ['NAB', 'CBA', 'Westpac'];
let nextLender = 0;

function createApplicationNode() {
    const node = window.GWT.ApplicationNodeFactory.create();
    node.setNodeLabel(lenders[nextLender++]);
    nextLender %= lenders.length;
    return node;
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
}

export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            lodgementNode: createLodgementNode(),
            openApps: [],
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (tabIndex) => {
            if (window.confirm('Are you sure you want to close the application?')) {
                const openApps = this.state.openApps;
                const newApps = [];
                const appIndex = tabIndex - 1;
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
            const openApps = this.state.openApps;
            if (openApps.length >= 5) {
                window.alert('Cannot open more tabs!');
                return;
            }

            const newApp = createApplicationNode();

            const newApps = [...openApps, newApp];
            this.setState({
                openApps: newApps,
                selectedIndex: newApps.length
            });
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
                <LodgementContentComponent model={selectedModel} />
            </div>
        );
    }
}
