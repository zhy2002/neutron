import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PersonGeneralComponent from './PersonGeneralComponent';
import PersonContactComponent from './PersonContactComponent';
import PersonCurrentEmploymentComponent from './PersonCurrentEmploymentComponent';
import PersonPreviousEmploymentComponent from './PersonPreviousEmploymentComponent';

export default class PersonComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();

        const selectedName = this.model.getSelectedName();
        newState.selectedItem = this.model.getChildByName(selectedName);

        return newState;
    }

    renderPersonContent() {
        const model = this.state.selectedItem;
        const className = model.getSimpleClassName();
        if (className === 'GeneralNode') {
            return <PersonGeneralComponent model={model}/>;
        }
        if (className === 'ContactNode') {
            return <PersonContactComponent model={model}/>;
        }
        if (className === 'CurrentEmploymentListNode') {
            return <PersonCurrentEmploymentComponent model={model}/>;
        }
        if (className === 'PreviousEmploymentListNode') {
            return <PersonPreviousEmploymentComponent model={model}/>;
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

    render() {
        return (
            <div className="person-component">
                {this.renderPersonContent()}
            </div>
        );
    }
}

PersonComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
