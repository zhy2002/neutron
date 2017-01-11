import React from 'react';
import RaisedButton from 'material-ui/RaisedButton';
import {Toolbar, ToolbarGroup, ToolbarSeparator, ToolbarTitle} from 'material-ui/Toolbar';


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
            <Toolbar>
                <ToolbarGroup firstChild>
                    <ToolbarTitle text="Application Manager"/>
                    <ToolbarSeparator />
                    <RaisedButton label="New App" primary onMouseUp={this.props.onNewApp}/>
                    <RaisedButton label="Test" primary onMouseUp={this.test}/>
                </ToolbarGroup>
            </Toolbar>
        );
    }
}

AppManagerToolbarComponent.propTypes = {
    onNewApp: React.PropTypes.func.isRequired
};
