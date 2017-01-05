import React from 'react';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";


export default class AddressComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        const model = this.model;

        return (
            <div id={model.getUniqueId()} tabIndex="0" className="row expanded">
                <div className="small-12 columns">
                    <p>{this.state.label}</p>
                </div>
            </div>
        );
    }

}