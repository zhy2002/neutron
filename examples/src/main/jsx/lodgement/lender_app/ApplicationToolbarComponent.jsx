import React from "react";
import {Toolbar} from "material-ui/Toolbar";

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
            </Toolbar>
        );
    }
}