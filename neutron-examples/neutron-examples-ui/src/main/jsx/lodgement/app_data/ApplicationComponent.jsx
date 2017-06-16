import React from 'react';
import NeutronHoc from '../../neutron/NeutronHoc';
import EventService from '../../neutron/EventService';
import ApplicationHeaderComponent from './ApplicationHeaderComponent';
import ApplicationContentComponent from './ApplicationContentComponent';
import ApplicationErrorsComponent from '../app_data/ApplicationErrorsComponent';
import LocationService from '../services/LocationService';


class ApplicationComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            contentTop: NaN
        };

        this.hideErrorList = () => {
            this.props.model.setShowErrorList(false);
        };

        this.handleHeaderHeightChanged = (height) => {
            this.setState({contentTop: height + 1});
        };

        EventService.subscribe('application_content_change', () => {
            if (this.props.currentModel) {
                LocationService.syncHashToState(this.props.currentModel);
            }
        });
    }

    render() {
        const errorClass = this.state.showErrorList ? 'show-error-list' : '';
        return (
            <div className={`${this.props.componentClass} ${errorClass}`}>
                <ApplicationHeaderComponent
                    applicationNode={this.props.model}
                    contentNode={this.props.currentModel}
                    onHeightChanged={this.handleHeaderHeightChanged}
                />
                {
                    !isNaN(this.state.contentTop) &&
                    <div className="fill-all" style={{top: `${this.state.contentTop}px`}}>
                        <ApplicationContentComponent model={this.props.currentModel}/>
                        {
                            this.props.showErrorList &&
                            <ApplicationErrorsComponent
                                onClose={this.hideErrorList}
                                model={this.props.model.getErrorListNode()}
                            />
                        }
                    </div>
                }
            </div>
        );
    }
}

function getCurrentModel(model) {
    let currentModel = model;
    let contentLevel = model.getContentLevel();
    while (contentLevel-- && currentModel) {
        if (currentModel.getSelectedIndex) {
            currentModel = currentModel.getItem(currentModel.getSelectedIndex());
        } else {
            currentModel = currentModel.getChildByName(currentModel.getSelectedName());
        }
    }
    return currentModel;
}

export default NeutronHoc(
    ApplicationComponent,
    (model) => {
        const newState = {};
        newState.showErrorList = model.getShowErrorList();
        newState.currentModel = getCurrentModel(model);
        return newState;
    }
);
