import React from 'react';
import Paper from "material-ui/Paper";

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import TelephoneComponent from "./TelephoneComponent.jsx";


const paperMargin = {
    margin: "10px 2px",
    paddingTop: "0.5em"
};

export default class PersonContactComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {

        const model = this.model;

        return (
            <div className="row expanded">
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <TelephoneComponent model={model.getHomePhoneNode()} />
                        <TelephoneComponent model={model.getWorkPhoneNode()} />
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        test222
                    </Paper>

                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        test333
                    </Paper>

                </div>
            </div>
        );
    }

}