import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";

export default class AddressComponent extends NeutronComponent {
    constructor(props) {
        super(props);
    }

    extractNewState() {
        let state = super.extractNewState();
        state.message = "hello";
        return state;
    }

    render() {
        return <h1>Message is: {this.state.message}!</h1>;
    }
}