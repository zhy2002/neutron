import React from 'react';
import NeutronComponent from './NeutronComponent';

export default class NodeLabelComponent extends NeutronComponent {

    render() {
        return <span>{this.state.label}</span>;
    }
}
