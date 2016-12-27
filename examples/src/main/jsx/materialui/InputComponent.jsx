import React from 'react';

import NeutronComponent from './NeutronComponent.jsx';
import {orange500, blue500} from 'material-ui/styles/colors';


const styles = {
    defaultStyle: {
    },
    errorStyle: {
        color: orange500
    },
    requiredStyle: {
        color: blue500,
        fontWeight: "bold"
    }
};

function nodeNameToLabel(nodeName) {
    if(nodeName.endsWith("Node")) {
        nodeName = nodeName.substr(0, nodeName.length - 4);
    }
    var result = "";
    for(let i=0; i<nodeName.length; i++) {
        let ch = nodeName.charAt(i);
        if(ch == ch.toUpperCase()) {
            result += " ";
        }
        if(i == 0) {
            ch = ch.toUpperCase();
        }
        result += ch;
    }
    return result;
}

export default class InputComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.label = props['label'];
        if(!this.label) {
            this.label = nodeNameToLabel(this.model.getName());
        }
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.label = this.label;

        newState.style = styles.defaultStyle;
        if(this.model.getRequired() && !this.model.getValue()) {
            newState.style = styles.requiredStyle;
        }

        return newState;
    }

}

InputComponent.propTypes = {
    label: React.PropTypes.string
};