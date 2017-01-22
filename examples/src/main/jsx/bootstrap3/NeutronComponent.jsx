import React from 'react';

const blue500 = 'blue';
const red500 = 'red';

const styles = {
    defaultStyle: {},
    requiredStyle: {
        color: blue500,
        fontWeight: 'bold'
    }
};

function deepCopy(obj) {
    return JSON.parse(JSON.stringify(obj));
}

function nodeNameToLabel(nodeName) {
    let name = nodeName;
    if (name.endsWith('Node')) {
        name = nodeName.substr(0, name.length - 4);
    }
    let result = '';
    for (let i = 0; i < name.length; i++) {
        let ch = name.charAt(i);
        if (ch === ch.toUpperCase()) {
            result += ' ';
        }
        if (i === 0) {
            ch = ch.toUpperCase();
        }
        result += ch;
    }
    return result;
}

export default class NeutronComponent extends React.Component {

    constructor(props) {
        super(props);

        this.callbackQueue = [];
        this.receiveProps(props);
        this.state = this.extractNewState();
    }

    componentWillReceiveProps(nextProps) {
        this.receiveProps(nextProps);
    }

    componentDidUpdate() {
        while (this.callbackQueue.length > 0) {
            const func = this.callbackQueue.shift();
            setTimeout(func, 0);
        }
    }

    componentWillUnmount() {
        if (this.model) {
            this.model.removeChangeListener(this);
        }
    }

    /**
     * This is called when the model has been updated.
     */
    onUiNodeChanged() {
        const newState = this.extractNewState();
        this.setState(newState);
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

    /**
     * Get all the state required for rendering.
     * @returns {{}} the complete state object for rendering.
     */
    extractNewState() {
        const newState = {};

        newState.errorMessage = '';
        const errorList = this.model.getValidationErrorList();
        if (errorList) {
            for (let i = 0; i < errorList.size(); i++) {
                const item = errorList.get(i);
                newState.errorMessage += `${item.getMessage()} `;
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

    /**
     * Add a function to be called when this component is rendered.
     * @param {Function} func a function.
     */
    addCallback(func) {
        this.callbackQueue.push(func);
    }
}

NeutronComponent.propTypes = {
    id: React.PropTypes.string.isRequired,
    model: React.PropTypes.object.isRequired
};


NeutronComponent.propTypes = {
    id: React.PropTypes.string,
    label: React.PropTypes.string,
    model: React.PropTypes.object.isRequired
};

NeutronComponent.defaultProps = {
    id: null,
    label: null
};
