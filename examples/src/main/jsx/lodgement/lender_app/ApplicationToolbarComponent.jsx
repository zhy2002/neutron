import React from "react";
import {Toolbar, ToolbarGroup} from "material-ui/Toolbar";
import RaisedButton from 'material-ui/RaisedButton';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import ApplicantSelectionList from './ApplicantSelectionComponent.jsx';


const toolbarStyle = {
    backgroundColor: "#FFF"
};

export default class ApplicationToolbarComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;

        return (
            <Toolbar style={toolbarStyle}>
                <ApplicantSelectionList model={model.getPersonListNode()}/>
                <ToolbarGroup>
                    <RaisedButton label="Validate" primary={true} onMouseUp={()=>{ model.refresh();}} />
                </ToolbarGroup>
            </Toolbar>
        );
    }
}