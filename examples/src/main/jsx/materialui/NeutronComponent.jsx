import React from 'react';
import {blue500, red500} from 'material-ui/styles/colors';

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

function nodeNameToLabel(nodeName) {
    if (nodeName.endsWith("Node")) {
        nodeName = nodeName.substr(0, nodeName.length - 4);
    }
    let result = "";
    for (let i = 0; i < nodeName.length; i++) {
        let ch = nodeName.charAt(i);
        if (ch === ch.toUpperCase()) {
            result += " ";
        }
        if (i === 0) {
            ch = ch.toUpperCase();
        }
        result += ch;
    }
    return result;
}

export default class NeutronComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.callbackQueue = [];
        this.receiveProps(props);
        this.state = this.extractNewState();
    }

    componentWillReceiveProps(nextProps) {
        this.receiveProps(nextProps);
    }

    /**
     * Initialize fields computed from props.
     * Since props is readonly, these fields are readonly as well.
     * @param props new props passed to this component.
     */
    receiveProps(props) {
        const model = props.model;

        this.id = props.id;
        if (!this.id) {
            this.id = model.getUniqueId();
        }

        this.label = props.label;
        if (!this.label) {
            this.label = nodeNameToLabel(model.getName());
        }

        if (this.model !== model) {
            if (this.model) {
                this.model.removeChangeListener(this);
            }
            model.addChangeListener(this);
            this.model = model;
        }
    }

    componentWillUnmount() {
        if (this.model) {
            this.model.removeChangeListener(this);
        }
    }

    extractNewState() {
        const newState = {};

        newState.errorMessage = "";
        let errorList = this.model.getValidationErrorList();
        if (errorList) {
            for (let i = 0; i < errorList.size(); i++) {
                let item = errorList.get(i);
                newState.errorMessage += item.getMessage() + " ";
            }
        }

        newState.style = deepCopy(styles.defaultStyle);
        if (!newState.errorMessage && this.model.getRequired() && !this.model.hasValue()) {
            newState.style = deepCopy(styles.requiredStyle);
        }
        if (newState.errorMessage) {
            newState.style.color = red500;
        }

        return newState;
    }

    onUiNodeChanged() {
        const newState = this.extractNewState();
        this.setState(newState);
    }

    addCallback(func) {
        if (func instanceof Function) {
            this.callbackQueue.push(func);
        }
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

