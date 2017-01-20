import React from 'react';

export default class AppManagerToolbarComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.test = () => {
            console.log('Running test..');
            this.setState({fixedValue: 'fixed'});
        };
    }

    render() {
        console.log('rendering AppManagerToolbarComponent...');
        return (
            <div className="container-fluid app-manager-toolbar-component">
                <ul className="nav navbar-nav">
                    <li>
                        <a tabIndex="0">
                            <div>
                                <span className="glyphicon glyphicon-plus-sign"/>
                            </div>
                            <div>
                                <small>Create</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0">
                            <div>
                                <span className="glyphicon glyphicon-pencil"/>
                            </div>
                            <div>
                                <small>Update</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0">
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
    onNewApp: React.PropTypes.func.isRequired
};
