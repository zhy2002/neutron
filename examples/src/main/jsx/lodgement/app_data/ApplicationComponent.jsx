import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import ApplicationNavComponent from './ApplicationNavComponent';
import ApplicationTabsComponent from './ApplicationTabsComponent';
import ApplicationContentComponent from './ApplicationContentComponent';
import ApplicationErrorsComponent from '../app_data/ApplicationErrorsComponent';


export default class ApplicationComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.state.currentModel = this.model.getPersonListNode();

        this.navigate = (currentModel) => {
            this.setState({
                currentModel
            });
        };

        this.hideErrorList = () => {
            this.model.setShowErrorList(false);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.showErrorList = this.model.getShowErrorList();

        return newState;
    }

    render() {
        const errorClass = this.state.showErrorList ? 'show-error-list' : '';
        return (
            <div className={`application-component ${errorClass}`}>
                <ApplicationNavComponent
                    model={this.model}
                    currentModel={this.state.currentModel}
                    onSelect={this.navigate}
                />
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
