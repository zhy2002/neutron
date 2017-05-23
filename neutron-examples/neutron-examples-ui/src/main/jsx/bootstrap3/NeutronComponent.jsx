import React from 'react';
import PropTypes from 'prop-types';


export default class NeutronComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.callbackQueue = [];
        this.receiveProps(props);
        this.state = this.extractNewState();
    }

    componentWillReceiveProps(nextProps) {
        this.receiveProps(nextProps);
        this.onUiNodeChanged();
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
        if (model === null)
            console.error('model prop must be provided!');

        this.id = props.id;
        if (!this.id) {
            this.id = model.getUniqueId();
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

        //error message
        newState.errorMessage = '';
        const errorList = this.model.getValidationErrorList();
        if (errorList) {
            for (let i = 0; i < errorList.size(); i++) {
                const item = errorList.get(i);
                newState.errorMessage += `${item.getMessage()} `;
            }
        }

        //component class
        let componentClass = '';
        if (newState.errorMessage) {
            componentClass = ' has-error';
        } else if (this.model.getRequired() && !this.model.hasValue() && !this.model.isEffectivelyDisabled()) {
            componentClass = ' missing-value';
        }
        const visibility = this.model.getVisibility();
        if (visibility === 'none') {
            componentClass += ' hide';
        } else if (visibility === 'hidden') {
            componentClass += ' invisible';
        }
        newState.componentClass = componentClass;

        //label
        if (this.props.label) {
            newState.label = this.props.label;
        } else {
            newState.label = this.model.getNodeLabel();
        }
        if (this.model.isDirty()) {
            newState.label = `${newState.label} *`;
        } else {
            newState.label = `${newState.label} `;
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
    id: PropTypes.string,
    label: PropTypes.string,
    hideLabel: PropTypes.bool,
    model: PropTypes.object.isRequired
};

NeutronComponent.defaultProps = {
    id: null,
    label: null,
    hideLabel: false
};
