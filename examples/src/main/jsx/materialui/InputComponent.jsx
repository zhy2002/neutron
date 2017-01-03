import React from 'react';

import NeutronComponent from './NeutronComponent.jsx';
import {blue500} from 'material-ui/styles/colors';


const styles = {
    defaultStyle: {
    },
    requiredStyle: {
        color: blue500,
        fontWeight: "bold"
    }
};

function deepCopy(obj) {
    return JSON.parse(JSON.stringify(obj));
}

function isEmptyValue(val) {
    return val === null || val === undefined || val === "";
}

function nodeNameToLabel(nodeName) {
    if(nodeName.endsWith("Node")) {
        nodeName = nodeName.substr(0, nodeName.length - 4);
    }
    let result = "";
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

        newState.errorMessage = "";
        let errorList = this.model.getValidationErrorList();
        if(errorList) {
            for(let i=0; i<errorList.size(); i++) {
                let item = errorList.get(i);
                newState.errorMessage += item.getMessage() + "\r\n";
            }
        }

        newState.style = deepCopy(styles.defaultStyle);
        if(!newState.errorMessage && this.model.getRequired() && isEmptyValue(this.model.getValue())) {
            newState.style = deepCopy(styles.requiredStyle);
        }

        return newState;
    }

}

InputComponent.propTypes = {
    label: React.PropTypes.string
};