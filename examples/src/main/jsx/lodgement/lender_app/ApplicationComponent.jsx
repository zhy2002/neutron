import React from 'react';
import NavPillsComponent from '../../bootstrap3/NavPillsComponent';

function sizeFunc() {
    return 0;
}

export default class ApplicationComponent extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };

        this.closeTab = (selectedIndex) => {
            window.alert(`hahaha ${selectedIndex}`);
        };
    }

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

        return (
            <div className="application-component">
                <div className="tabs-container">
                    <NavPillsComponent
                        items={tabItems}
                        selectedIndex={this.state.selectedIndex}
                        onSelect={this.selectTab}
                        onClose={this.closeTab}
                    />
                </div>
                <div className="main-content">
                    <div>
                        <p>start</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>app data</p>
                        <p>end</p>
                    </div>
                </div>
            </div>
        );
    }

}

ApplicationComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
