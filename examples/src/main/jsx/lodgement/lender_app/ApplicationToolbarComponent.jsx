import React from 'react';
import {Toolbar, ToolbarGroup} from 'material-ui/Toolbar';
import RaisedButton from 'material-ui/RaisedButton';
import NeutronComponent from '../../materialui/NeutronComponent';
import ApplicantSelectionList from './ApplicantSelectionComponent';
import CommonUtil from '../CommonUtil';

const toolbarStyle = {
    backgroundColor: '#FFF'
};

export default class ApplicationToolbarComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.validate = () => {
            this.model.refresh();
        };

        this.showJson = () => {
            const obj = CommonUtil.extractValue(this.model);
            console.log('extracted object:');
            console.log(obj);
            window.alert(JSON.stringify(obj));
        };

        this.loadJson = () => {
            const model = this.model;
            $.get(
                'json/application/app1.json',
                (data) => {
                    const context = model.getContext();
                    context.beginSession();
                    CommonUtil.setValue(model, data);
                    context.commitSession();
                }
            );
        };
    }


    render() {
        const model = this.model;

        return (
            <Toolbar style={toolbarStyle}>
                <ApplicantSelectionList model={model.getPersonListNode()}/>
                <ToolbarGroup>
                    <RaisedButton label="Validate" primary onMouseUp={this.validate}/>
                    <RaisedButton label="Show JSON" primary onMouseUp={this.showJson}/>
                    <RaisedButton label="Load JSON" primary onMouseUp={this.loadJson}/>
                </ToolbarGroup>
            </Toolbar>
        );
    }
}
