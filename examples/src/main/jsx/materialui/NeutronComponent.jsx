import React from "react";
import {blue500, red500} from "material-ui/styles/colors";

const styles = {
    defaultStyle: {},
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
    if (nodeName.endsWith("Node")) {
        nodeName = nodeName.substr(0, nodeName.length - 4);
    }
    let result = "";
    for (let i = 0; i < nodeName.length; i++) {
        let ch = nodeName.charAt(i);
        if (ch == ch.toUpperCase()) {
            result += " ";
        }
        if (i == 0) {
            ch = ch.toUpperCase();
        }
        result += ch;
    }
    return result;
}

export default class NeutronComponent extends React.Component {

    constructor(props) {
        super(props);

        this.initialize(props);
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
        this.callbackQueue = [];
    }

    initialize(props) {
        this.id = props["id"];
        this.model = props["model"];

        this.label = props['label'];
        if (!this.label) {
            this.label = nodeNameToLabel(this.model.getName());
        }
    }

    extractNewState() {
        const newState = {};

        newState.label = this.label;

        newState.errorMessage = "";
        let errorList = this.model.getValidationErrorList();
        if (errorList) {
            for (let i = 0; i < errorList.size(); i++) {
                let item = errorList.get(i);
                newState.errorMessage += item.getMessage() + "\r\n";
            }
        }

        newState.style = deepCopy(styles.defaultStyle);
        if (!newState.errorMessage && this.model.getRequired() && isEmptyValue(this.model.getValue())) {
            newState.style = deepCopy(styles.requiredStyle);
        }

        if(newState.errorMessage) {
            newState.style.color = red500;
        }

        return newState;
    }

    addCallback(func) {
        if (func instanceof Function) {
            this.callbackQueue.push(func);
        }
    }

    componentWillReceiveProps(nextProps) {
        //todo might need to do somthing here...
    }

    onUiNodeChanged() {
        let newState = this.extractNewState();
        this.setState(newState);
    }

    componentWillUnmount() {
        this.model.removeChangeListener(this);
    }

    componentDidUpdate() {
        while (this.callbackQueue.length > 0) {
            let func = this.callbackQueue.shift();
            setTimeout(func, 0);
        }
    }
}

NeutronComponent.propTypes = {
    id: React.PropTypes.string,
    label: React.PropTypes.string,
    model: React.PropTypes.object.isRequired
};

