import React from 'react';
import PropTypes from 'prop-types';
import ApplicationComponent from './app_data/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';

export default class LodgementContentComponent extends React.PureComponent {

    renderContent() {
        const model = this.props.model;
        if (model.getName() === 'appManagerNode') {
            return (
                <ApplicationListComponent model={model.getApplicationListNode()} onLoadApp={this.props.onLoadApp}/>
            );
        }
        return (
            <ApplicationComponent model={model}/>
        );
    }

    render() {
        return (
            <div className="lodgement-content-component">
                {this.renderContent()}
            </div>
        );
    }

}

LodgementContentComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onLoadApp: PropTypes.func.isRequired
};
