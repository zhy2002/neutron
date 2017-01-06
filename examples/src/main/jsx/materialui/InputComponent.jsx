import React from 'react';

import NeutronComponent from './NeutronComponent.jsx';


export default class InputComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.columnStyle = props['columnStyle'] || {};
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.columnStyle = this.columnStyle;

        return newState;
    }


}

InputComponent.propTypes = {
    columnStyle: React.PropTypes.object
};