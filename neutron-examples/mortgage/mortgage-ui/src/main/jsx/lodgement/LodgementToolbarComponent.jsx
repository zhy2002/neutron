import React from 'react';
import PropTypes from 'prop-types';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';
import ApplicationToolbarComponent from './app_data/ApplicationToolbarComponent';

export default function LodgementToolbarComponent({model, onNewApp, onOpenApp, onCloneApp, onDeleteApp}) {
    return (
        <div className="navbar navbar-default lodgement-toolbar-component">
            {
                model.getName() === 'appManagerNode' ?
                    <AppManagerToolbarComponent
                        model={model}
                        onNewApp={onNewApp}
                        onOpenApp={onOpenApp}
                        onCloneApp={onCloneApp}
                        onDeleteApp={onDeleteApp}
                    /> :
                    <ApplicationToolbarComponent model={model}/>
            }
        </div>
    );
}

LodgementToolbarComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onNewApp: PropTypes.func.isRequired,
    onOpenApp: PropTypes.func.isRequired,
    onCloneApp: PropTypes.func.isRequired,
    onDeleteApp: PropTypes.func.isRequired
};
