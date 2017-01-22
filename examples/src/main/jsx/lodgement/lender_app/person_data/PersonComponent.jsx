import React from 'react';
import NavPillsComponent from '../../../bootstrap3/NavPillsComponent';
import PersonGeneralComponent from './PersonGeneralComponent';

function renderMainContent(model) {
    const className = model.getSimpleClassName();
    if (className === 'GeneralNode') {
        return <PersonGeneralComponent model={model} />;
    }

    return (
        <div>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
            <p>unknown model type {className}</p>
        </div>
    );
}

export default class PersonComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };
    }

    render() {
        const tabItems = this.props.model.getChildren();
        const currentChild = tabItems[this.state.selectedIndex];

        return (
            <div className="person-component">
                <NavPillsComponent
                    items={tabItems}
                    selectedIndex={this.state.selectedIndex}
                    onSelect={this.selectTab}
                />
                <div className="person-main-content">
                    {renderMainContent(currentChild)}
                </div>
            </div>
        );
    }
}

PersonComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
