import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import ApplicationNavComponent from './ApplicationNavComponent';
import ApplicationTabsComponent from './ApplicationTabsComponent';
import ApplicationContentComponent from './ApplicationContentComponent';
import ApplicationErrorsComponent from '../app_data/ApplicationErrorsComponent';


export default class ApplicationComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.hideErrorList = () => {
            this.model.setShowErrorList(false);
        };
    }

    getCurrentModel() {
        let model = this.model;
        let contentLevel = this.model.getContentLevel();
        while (contentLevel--) {
            if (model.getSelectedIndex) {
                model = model.getItem(model.getSelectedIndex());
            } else {
                model = model.getChildByName(model.getSelectedName());
            }
        }
        return model;
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.showErrorList = this.model.getShowErrorList();

        newState.currentModel = this.getCurrentModel();

        return newState;
    }

    render() {
        console.log('ApplicationComponent render');
        const errorClass = this.state.showErrorList ? 'show-error-list' : '';
        return (
            <div className={`application-component ${errorClass}`}>
                <ApplicationNavComponent model={this.model}/>
                <ApplicationTabsComponent model={this.state.currentModel}/>
                <ApplicationContentComponent model={this.state.currentModel}/>
                <ApplicationErrorsComponent
                    visible={this.state.showErrorList}
                    onClose={this.hideErrorList}
                    model={this.model.getErrorListNode()}
                />
            </div>
        );
    }
}

ApplicationComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
