import React from 'react';
import PropTypes from 'prop-types';
import ApplicationComponent from './app_data/ApplicationComponent';
import ApplicationListComponent from './app_manager/ApplicationListComponent';

export default class LodgementContentComponent extends React.PureComponent {

    render() {
        const model = this.props.model;

        return (
            <div className="lodgement-content-component">
                {
                    model.getName() === 'appManagerNode' ?
                    <ApplicationListComponent
                        model={model.getApplicationListNode()}
                        onLoadApp={this.props.onLoadApp}
                    /> :
                    <ApplicationComponent model={model}/>
                }
            </div>
        );
    }

}

LodgementContentComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onLoadApp: PropTypes.func.isRequired
};
