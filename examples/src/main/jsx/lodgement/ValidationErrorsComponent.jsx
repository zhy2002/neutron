import React from "react";
import Paper from "material-ui/Paper";
import NeutronComponent from "../materialui/NeutronComponent.jsx";
import FloatingActionButton from "material-ui/FloatingActionButton";
import ContentRemove from "material-ui/svg-icons/content/remove";

import ErrorListComponent from './ErrorListComponent.jsx';


export default class ValidationErrorsComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;
        let style = {};
        if (!model.getShowErrorList()) {
            style.display = "none";
        }

        return (
            <div className="expanded row" style={style}>
                <div className="medium-12 columns">

                    <Paper style={{marginBottom: "1em"}}>

                        <div className="expanded row">
                            <div className="medium-8 medium-offset-2 columns">
                                <div style={{textAlign: "center"}}>
                                    <h5>Validation Errors</h5>
                                </div>
                            </div>
                            <div className="medium-2 columns">
                                <FloatingActionButton
                                    mini={true}
                                    style={{float: "right", margin: "0.5em"}}
                                    onMouseUp={() => {
                                        model.setShowErrorList(false)
                                    }}>
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