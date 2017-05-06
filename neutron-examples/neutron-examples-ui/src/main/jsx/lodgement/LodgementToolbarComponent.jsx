import React from 'react';
import PropTypes from 'prop-types';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
import ApplicationToolbarComponent from './app_data/ApplicationToolbarComponent';

export default class LodgementToolbarComponent extends React.PureComponent {
    //todo eliminate passing prop down multiple layers by ui node event system.
    render() {
        const model = this.props.model;
        return (
            <div className="lodgement-toolbar-component">
                {
                    model.getName() === 'appManagerNode' ?
                    <AppManagerToolbarComponent model={model} onNewApp={this.props.onNewApp}/> :
                    <ApplicationToolbarComponent model={model}/>
                }
            </div>
        );
    }
}

LodgementToolbarComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onNewApp: PropTypes.func.isRequired
};
