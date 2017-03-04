import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import UsageComponent from './UsageComponent';
import PropertyComponent from './PropertyComponent';
import AccessComponent from './AccessComponent';

export default class RealEstateComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();

        const selectedName = this.model.getSelectedName();
        newState.selectedItem = this.model.getChildByName(selectedName);

        return newState;
    }

    renderContent() {
        const model = this.state.selectedItem;
        const className = model.getConcreteClassName();
        if (className === 'UsageNode') {
            return <UsageComponent model={model}/>;
        }
        if (className === 'PropertyNode') {
            return <PropertyComponent model={model}/>;
        }
        if (className === 'AccessNode') {
            return <AccessComponent model={model}/>;
        }

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
            <div className="real-estate-component">
                {this.renderContent()}
            </div>
        );
    }
}
