import React from 'react';
import RaisedButton from 'material-ui/RaisedButton';
import {Toolbar, ToolbarGroup, ToolbarSeparator, ToolbarTitle} from 'material-ui/Toolbar';


export default class AppManagerToolbarComponent extends React.Component {

    constructor(props) {
        super(props);

        this.onNewApp = props["onNewApp"];
    }

    render() {
        return (
            <Toolbar>
                <ToolbarGroup firstChild={true}>
                    <ToolbarTitle text="Application Manager" />
                    <ToolbarSeparator />
                    <RaisedButton label="New App" primary={true} onMouseUp={this.onNewApp} />
                </ToolbarGroup>
            </Toolbar>
        );
    }
}

AppManagerToolbarComponent.propTypes = {
    onNewApp: React.PropTypes.func.isRequired
};
