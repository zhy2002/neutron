import React from 'react';
import PropTypes from 'prop-types';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
import ApplicationToolbarComponent from './app_data/ApplicationToolbarComponent';

export default class LodgementToolbarComponent extends React.PureComponent {

    renderToolbar() {
        const model = this.props.model;
        if (model.getName() === 'appManagerNode') {
            //todo eliminate passing prop down multiple layers by ui node event system.
            return <AppManagerToolbarComponent model={model} onNewApp={this.props.onNewApp}/>;
        }
        return <ApplicationToolbarComponent model={model}/>;
    }

    render() {
        return (
            <div className="lodgement-toolbar-component">
                {this.renderToolbar()}
            </div>
        );
    }
}

LodgementToolbarComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onNewApp: PropTypes.func.isRequired
};
