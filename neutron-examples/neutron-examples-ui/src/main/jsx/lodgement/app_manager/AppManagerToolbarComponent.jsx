import React from 'react';
import PropTypes from 'prop-types';
import LodgementService from '../services/LodgementService';


export default class AppManagerToolbarComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onRefresh = () => {
            LodgementService.refreshApplicationList();
        };

        this.notImplemented = () => {
            alert('This feature is not implemented');
        };
    }

    render() {
        return (
            <div className="container-fluid app-manager-toolbar-component">
                <ul className="nav navbar-nav toolbar">
                    <li>
                        <a tabIndex="0" onClick={this.props.onNewApp}>
                            <div>
                                <span className="glyphicon glyphicon-plus-sign"/>
                            </div>
                            <div>
                                <small>Create</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.props.onOpenApp}>
                            <div>
                                <span className="glyphicon glyphicon-open"/>
                            </div>
                            <div>
                                <small>Open</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.props.onCloneApp}>
                            <div>
                                <span className="glyphicon glyphicon-copy"/>
                            </div>
                            <div>
                                <small>Clone</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.props.onDeleteApp}>
                            <div>
                                <span className="glyphicon glyphicon-remove" />
                            </div>
                            <div>
                                <small>Delete</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.notImplemented}>
                            <div>
                                <span className="glyphicon glyphicon-stats"/>
                            </div>
                            <div>
                                <small>Status</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.onRefresh}>
                            <div>
                                <span className="glyphicon glyphicon-refresh"/>
                            </div>
                            <div>
                                <small>Refresh</small>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
        );
    }
}

AppManagerToolbarComponent.propTypes = {
    onNewApp: PropTypes.func.isRequired,
    onOpenApp: PropTypes.func.isRequired,
    onCloneApp: PropTypes.func.isRequired,
    onDeleteApp: PropTypes.func.isRequired
};
