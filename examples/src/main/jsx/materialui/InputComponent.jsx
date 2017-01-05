import React from 'react';

import NeutronComponent from './NeutronComponent.jsx';


export default class InputComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);
    }

    extractNewState() {
        let newState = super.extractNewState();
        return newState;
    }

}

