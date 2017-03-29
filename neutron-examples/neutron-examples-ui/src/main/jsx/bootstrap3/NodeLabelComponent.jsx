import React from 'react';
import NeutronComponent from './NeutronComponent';

export default class NodeLabelComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.text = this.model.getNodeLabel();
        if (this.model.isDirty()) {
            newState.text = `* ${newState.text}`;
        }
        return newState;
    }

    render() {
        return <span>{this.state.text}</span>;
    }
}
