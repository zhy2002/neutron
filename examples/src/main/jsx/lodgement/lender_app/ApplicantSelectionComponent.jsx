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

        this.closeDialog = () => {
            this.setState({openDialog: false});
        };

        this.deleteApplicant = () => {
            this.setState({openDialog: false});
            const selectedIndex = this.model.getSelectedIndex();
            this.model.removeByIndex(selectedIndex);
        };

        this.selectApplicant = (event, key) => {
            this.model.setSelectedIndex(key);
        };

        this.createNewApplicant = () => {
            this.model.createItem();
            const newIndex = this.model.getItemCount() - 1;
            this.model.setSelectedIndex(newIndex);
        };

        this.removeCurrentApplicant = () => {
            this.setState({openDialog: true});
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        const applicantNames = [];
        for (let i = 1; i <= this.model.getItemCount(); i++) {
            applicantNames.push(`Applicant ${i}`);
        }
        if (applicantNames.length === 0) {
            applicantNames.push('No Applicant');
        }
        newState.applicantNames = applicantNames;

        newState.selectedIndex = this.model.getSelectedIndex();

        return newState;
    }

    renderMenuItems() {
        const menuItems = [];
        const applicantNames = this.state.applicantNames;
        for (let i = 0; i < applicantNames.length; i++) {
            menuItems.push(<MenuItem key={i} value={i} primaryText={applicantNames[i]}/>);
        }
        return menuItems;
    }

    render() {
        const menuItems = this.renderMenuItems();

        const actions = [
            <FlatButton
                label="Cancel"
                primary
                onTouchTap={this.closeDialog}
            />,
            <FlatButton
                label="Ok"
                primary
                onTouchTap={this.deleteApplicant}
            />
        ];

        return (
            <ToolbarGroup firstChild>
                <DropDownMenu value={this.state.selectedIndex} onChange={this.selectApplicant}>
                    {menuItems}
                </DropDownMenu>
                <FloatingActionButton
                    mini
                    style={{marginRight: '1em'}}
                    onMouseUp={this.createNewApplicant}
                >
                    <ContentAdd />
                </FloatingActionButton>
                <FloatingActionButton
                    mini
                    disabled={menuItems.length < 2}
                    onMouseUp={this.removeCurrentApplicant}
                >
                    <ContentRemove />
                </FloatingActionButton>
                <Dialog
                    title="Delete current applicant?"
                    actions={actions}
                    modal
                    open={this.state.openDialog}
                >
                    Are you sure you want to delete the current applicant?
                </Dialog>
                <ToolbarSeparator />
            </ToolbarGroup>
        );
    }

}
