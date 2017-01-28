import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PersonGeneralComponent from './PersonGeneralComponent';
import PersonContactComponent from './PersonContactComponent';
import PersonEmploymentListComponent from './PersonEmploymentListComponent';
import PersonTrustComponent from './PersonTrustComponent';
import PersonPrivacyComponent from './PersonPrivacyComponent';
import PersonOtherIncomeListComponent from './PersonOtherIncomeListComponent';
import PersonResponsibleLendComponent from './PersonResponsibleLendComponent';

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
        if (className === 'PersonGeneralNode') {
            return <PersonGeneralComponent model={model}/>;
        }
        if (className === 'PersonContactNode') {
            return <PersonContactComponent model={model}/>;
        }
        if (className === 'CurrentEmploymentListNode') {
            return <PersonEmploymentListComponent model={model}/>;
        }
        if (className === 'PreviousEmploymentListNode') {
            return <PersonEmploymentListComponent model={model}/>;
        }
        if (className === 'PersonTrustNode') {
            return <PersonTrustComponent model={model}/>;
        }
        if (className === 'PersonPrivacyNode') {
            return <PersonPrivacyComponent model={model}/>;
        }
        if (className === 'PersonOtherIncomeListNode') {
            return <PersonOtherIncomeListComponent model={model}/>;
        }
        if (className === 'PersonResponsibleLendNode') {
            return <PersonResponsibleLendComponent model={model}/>;
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
            <div className="person-component">
                {this.renderPersonContent()}
            </div>
        );
    }
}

PersonComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
