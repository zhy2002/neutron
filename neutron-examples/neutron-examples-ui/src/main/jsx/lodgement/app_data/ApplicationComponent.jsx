import React from 'react';
import PropTypes from 'prop-types';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import ApplicationHeaderComponent from './ApplicationHeaderComponent';
import ApplicationContentComponent from './ApplicationContentComponent';
import ApplicationErrorsComponent from '../app_data/ApplicationErrorsComponent';


export default class ApplicationComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.hideErrorList = () => {
            this.model.setShowErrorList(false);
        };

        this.handleHeaderHeightChanged = (height) => {
            this.contentTop = height + 1;
            this.setState({contentTop: this.contentTop});
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
        if (typeof this.contentTop !== 'number') {
            this.contentTop = NaN;
        }
        newState.currentTop = this.currentTop;

        return newState;
    }

    render() {
        const errorClass = this.state.showErrorList ? 'show-error-list' : '';
        return (
            <div className={`application-component ${errorClass}`}>
                <ApplicationHeaderComponent
                    applicationNode={this.model}
                    contentNode={this.state.currentModel}
                    onHeightChanged={this.handleHeaderHeightChanged}
                />
                {
                    !isNaN(this.state.contentTop) &&
                    <div className="fill-all" style={{top: `${this.state.contentTop}px`}}>
                        <ApplicationContentComponent model={this.state.currentModel}/>
                        {
                            this.state.showErrorList &&
                            <ApplicationErrorsComponent
                                onClose={this.hideErrorList}
                                model={this.model.getErrorListNode()}
                            />
                        }
                    </div>

                }
            </div>
        );
    }
}

ApplicationComponent.propTypes = {
    model: PropTypes.object.isRequired
};
