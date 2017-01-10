import React from 'react';
import RaisedButton from 'material-ui/RaisedButton';
import {Toolbar, ToolbarGroup, ToolbarSeparator, ToolbarTitle} from 'material-ui/Toolbar';


export default class AppManagerToolbarComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onNewApp = props["onNewApp"];
    }

    test() {
        console.log('Running test..');
        this.setState({fixedValue: "fixed"});
    }

    render() {
        console.log('rendering AppManagerToolbarComponent...');
        return (
            <Toolbar>
                <ToolbarGroup firstChild={true}>
                    <ToolbarTitle text="Application Manager" />
                    <ToolbarSeparator />
                    <RaisedButton label="New App" primary={true} onMouseUp={this.onNewApp} />
                    <RaisedButton label="Test" primary={true} onMouseUp={this.test.bind(this)} />
                </ToolbarGroup>
            </Toolbar>
        );
    }
}

AppManagerToolbarComponent.propTypes = {
    onNewApp: React.PropTypes.func.isRequired
};
