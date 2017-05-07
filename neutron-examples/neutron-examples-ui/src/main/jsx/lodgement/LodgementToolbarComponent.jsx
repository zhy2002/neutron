import React from 'react';
import PropTypes from 'prop-types';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
import ApplicationToolbarComponent from './app_data/ApplicationToolbarComponent';

export default function LodgementToolbarComponent(props) {
    const model = props.model;

    return (
        <div className="navbar navbar-default lodgement-toolbar-component">
            {
                model.getName() === 'appManagerNode' ?
                    <AppManagerToolbarComponent model={model} onNewApp={props.onNewApp}/> :
                    <ApplicationToolbarComponent model={model}/>
            }
        </div>
    );
}

LodgementToolbarComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onNewApp: PropTypes.func.isRequired
};
