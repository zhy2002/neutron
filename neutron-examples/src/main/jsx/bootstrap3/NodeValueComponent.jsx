import React from 'react';
import NeutronComponent from './NeutronComponent';

export default class NodeValueComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.text = `${this.model.getValue()}`;
        return newState;
    }

    render() {
        return <span>{this.state.text}</span>;
    }
}
