import React from 'react';
import ApplicationToolbarComponent from './lender_app/ApplicationToolbarComponent';
import AppManagerToolbarComponent from './app_manager/AppManagerToolbarComponent';

export default class AppToolbarComponent extends React.PureComponent {

    render() {
        let toolbar;
        if (this.props.model.getNodeLabel) {
            toolbar = <ApplicationToolbarComponent model={this.props.model}/>;
        } else {
            toolbar = <AppManagerToolbarComponent model={this.props.model} onNewApp={this.props.onNewApp}/>;
        }

        return (
            <div className="container-fluid app-toolbar">
                {toolbar}
            </div>
        );
    }
}

AppToolbarComponent.propTypes = {
    model: React.PropTypes.object.isRequired,
    onNewApp: React.PropTypes.func.isRequired
};
