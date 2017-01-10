import React from 'react';
import {ToolbarGroup, ToolbarSeparator} from 'material-ui/Toolbar';
import DropDownMenu from 'material-ui/DropDownMenu';
import MenuItem from 'material-ui/MenuItem';
import FloatingActionButton from 'material-ui/FloatingActionButton';
import ContentAdd from 'material-ui/svg-icons/content/add';
import ContentRemove from 'material-ui/svg-icons/content/remove';
import Dialog from 'material-ui/Dialog';
import FlatButton from 'material-ui/FlatButton';
import NeutronComponent from '../../materialui/NeutronComponent';

export default class ApplicantSelectionComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.state.openDialog = false;
    }

    createNewApplicant() {
        const newApplicant = this.model.createItem();
        const newIndex = this.model.getItemCount() - 1;
        this.model.setSelectedIndex(newIndex);
    }

    removeCurrentApplicant() {
        this.setState({openDialog: true});
    }

    selectApplicant(event, key) {
        this.model.setSelectedIndex(key);
    }

    extractNewState() {
        const newState = super.extractNewState();

        let applicantNames = [];
        for(let i=1; i<=this.model.getItemCount(); i++) {
            applicantNames.push('Applicant ' + i);
        }
        if(applicantNames.length === 0) {
            applicantNames.push("No Applicant");
        }
        newState.applicantNames = applicantNames;

        newState.selectedIndex = this.model.getSelectedIndex();

        return newState;
    }

    deleteApplicant() {
        this.setState({openDialog: false});
        const selectedIndex = this.model.getSelectedIndex();
        this.model.removeByIndex(selectedIndex);
    }

    closeDialog() {
        this.setState({openDialog: false});
    }

    render() {
        let menuItems = [];
        let applicantNames = this.state.applicantNames;
        for(let i=0; i<applicantNames.length; i++) {
            menuItems.push(<MenuItem key={i} value={i} primaryText={applicantNames[i]}/>);
        }

        const actions = [
            <FlatButton
                label="Cancel"
                primary={true}
                onTouchTap={this.closeDialog.bind(this)}
            />,
            <FlatButton
                label="Ok"
                primary={true}
                onTouchTap={this.deleteApplicant.bind(this)}
            />
        ];

        return (
            <ToolbarGroup firstChild={true}>
                <DropDownMenu value={this.state.selectedIndex} onChange={this.selectApplicant.bind(this)}>
                    {menuItems}
                </DropDownMenu>
                <FloatingActionButton mini={true} style={{marginRight:"1em"}} onMouseUp={this.createNewApplicant.bind(this)} >
                    <ContentAdd />
                </FloatingActionButton>
                <FloatingActionButton mini={true} disabled={menuItems.length < 2} onMouseUp={this.removeCurrentApplicant.bind(this)}>
                    <ContentRemove />
                </FloatingActionButton>
                <Dialog
                    title="Delete current applicant?"
                    actions={actions}
                    modal={true}
                    open={this.state.openDialog}
                >
                    Are you sure you want to delete the current applicant?
                </Dialog>
                <ToolbarSeparator />
            </ToolbarGroup>
        );
    }

}