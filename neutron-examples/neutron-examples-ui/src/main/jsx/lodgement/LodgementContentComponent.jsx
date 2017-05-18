import React from 'react';
import PropTypes from 'prop-types';
import ApplicationComponent from './app_data/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';
import LodgementService from './services/LodgementService';


export default function LodgementContentComponent(props) {
    const model = props.model;

    return (
        <div className="lodgement-content-component" style={{top: `${props.top}px`, bottom: `${props.bottom}px`}}>
            {
                model.getName() === 'appManagerNode' ?
                    <ApplicationListComponent
                        model={model.getApplicationListNode()}
                        onOpenApp={LodgementService.openApp}
                    /> :
                    <ApplicationComponent model={model}/>
            }
        </div>
    );
}

LodgementContentComponent.propTypes = {
    model: PropTypes.object.isRequired,
    top: PropTypes.number.isRequired,
    bottom: PropTypes.number.isRequired
};
