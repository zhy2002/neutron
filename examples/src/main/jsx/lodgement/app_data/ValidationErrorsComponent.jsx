import React from 'react';
import Paper from 'material-ui/Paper';
import FloatingActionButton from 'material-ui/FloatingActionButton';
import ContentRemove from 'material-ui/svg-icons/content/remove';
import NeutronComponent from '../materialui/NeutronComponent';
import ErrorListComponent from './ErrorListComponent';


export default class ValidationErrorsComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.hide = () => {
            this.model.setShowErrorList(false);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.panelStyle = {};
        if (!this.model.getShowErrorList()) {
            newState.panelStyle.display = 'none';
        }
        return newState;
    }

    render() {
        const model = this.model;

        return (
            <div className="expanded row" style={this.state.panelStyle}>
                <div className="medium-12 columns">

                    <Paper style={{marginBottom: '1em'}}>

                        <div className="expanded row">
                            <div className="medium-8 medium-offset-2 columns">
                                <div style={{textAlign: 'center', paddingTop: '1em'}}>
                                    <h5>Validation Errors</h5>
                                </div>
                            </div>
                            <div className="medium-2 columns">
                                <FloatingActionButton
                                    mini
                                    style={{float: 'right', margin: '0.5em'}}
                                    onMouseUp={this.hide}
                                >
                                    <ContentRemove />
                                </FloatingActionButton>
                            </div>
                        </div>
                        <div className="expanded row">
                            <div className="medium-12 columns">
                                <ErrorListComponent model={model.getErrorListNode()}/>
                            </div>
                        </div>
                    </Paper>
                </div>
            </div>
        );
    }

}
