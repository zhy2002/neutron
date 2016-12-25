import React from 'react';
import {ToolbarGroup, ToolbarSeparator} from "material-ui/Toolbar";
import DropDownMenu from "material-ui/DropDownMenu";
import MenuItem from "material-ui/MenuItem";
import FloatingActionButton from 'material-ui/FloatingActionButton';
import ContentAdd from 'material-ui/svg-icons/content/add';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";

export default class ApplicantSelectionComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    createNewApplicant() {
        let newApplicant = this.model.createItem();
        console.log('New applicant created.');
        console.log(newApplicant);
    }

    extractNewState() {
        let newState = super.extractNewState();

        let applicantNames = [];
        for(let i=1; i<=this.model.getItemCount(); i++) {
            applicantNames.push('Applicant ' + i);
        }
        if(applicantNames.length === 0) {
            applicantNames.push("No Applicant");
        }
        newState.applicantNames = applicantNames;

        return newState;
    }

    render() {
        let menuItems = [];
        let applicantNames = this.state.applicantNames;
        for(let i=0; i<applicantNames.length; i++) {
            menuItems.push(<MenuItem key={i} value={i} primaryText={applicantNames[i]}/>);
        }

        return (
            <ToolbarGroup firstChild={true}>
                <DropDownMenu value={0}>
                    {menuItems}
                </DropDownMenu>
                <FloatingActionButton mini={true} onMouseUp={this.createNewApplicant.bind(this)} >
                    <ContentAdd />
                </FloatingActionButton>
                <ToolbarSeparator />
            </ToolbarGroup>
        );
    }

}