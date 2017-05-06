import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import LocationService from '../../services/LocationService';

export default class TabContentComponent extends NeutronComponent {

    extractNewState() {
        console.log('PersonComponent.extractNewState');
        const newState = super.extractNewState();

        const selectedName = this.model.getSelectedName();
        newState.selectedItem = this.model.getChildByName(selectedName);

        return newState;
    }

    componentDidMount() {
        LocationService.syncHashToState(this.model, true);
    }

    componentDidUpdate() {
        super.componentDidUpdate();
        LocationService.syncHashToState(this.model, true);
    }

    renderTabContent(className, model) {
        console.log(this.label);
        console.log(className);
        console.log(model);
    }

    renderContent() {
        const model = this.state.selectedItem;
        const className = model.getConcreteClassName();

        const component = this.renderTabContent(className, model);
        if (component)
            return component;

        return (
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-12">
                        <em>unknown model type {className}</em>
                    </div>
                </div>
            </div>
        );
    }

    render() {
        return (
            <div className="tab-content-component">
                {this.renderContent()}
            </div>
        );
    }
}
