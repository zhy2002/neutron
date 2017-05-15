import React from 'react';
import PropTypes from 'prop-types';
import UiService from '../services/UiService';

export default class AppManagerToolbarComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onRefresh = () => {
            UiService.refreshApplicationList();
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
    onNewApp: PropTypes.func.isRequired
};
