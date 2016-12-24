import React from "react";

import HeaderComponent from './HeaderComponent.jsx';
import MainComponent from './MainComponent.jsx';

import NeutronComponent from '../materialui/NeutronComponent.jsx';

export default class LodgementComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        console.log("Rendering LodgementComponent...");
        let model = this.model;
        return (
            <div>
                <HeaderComponent model={model} />
                <MainComponent model={model} />
            </div>
        );
    }
}