import React from 'react';
import PropTypes from 'prop-types';
import ApplicationComponent from './app_data/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';


export default class LodgementContentComponent extends React.PureComponent {
    render() {
        if (isNaN(this.props.top) || isNaN(this.props.bottom))
            return null;

        const model = this.props.model;
        return (
            <div
                className="lodgement-content-component"
                style={{top: `${this.props.top}px`, bottom: `${this.props.bottom}px`}}
            >
                {model.getName() === 'appManagerNode' ?
                    <ApplicationListComponent
                        model={model.getApplicationListNode()}
                    /> :
                    <ApplicationComponent model={model}/>}
            </div>
        );
    }
}

LodgementContentComponent.propTypes = {
    model: PropTypes.object.isRequired,
    top: PropTypes.number.isRequired,
    bottom: PropTypes.number.isRequired
};
