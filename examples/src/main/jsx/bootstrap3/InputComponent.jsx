import React from 'react';
import NeutronComponent from './NeutronComponent';

export default class InputComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.value = this.getUiValue();
        return newState;
    }

    /**
     * From model value to ui value.
     * @returns {*} the model value.
     */
    getUiValue() {
        return this.model.getValue();
    }

    getValueOptions() {
        return this.model.getStateValue(this.props.listName);
    }

    renderContainerClass(clazz) {
        let containerClass = 'form-group form-group-sm';
        if (this.state.componentClass) {
            containerClass = `${containerClass} ${this.state.componentClass}`;
        }
        if (this.props.containerClass) {
            containerClass = `${containerClass} ${this.props.containerClass}`;
        }
        if (clazz) {
            containerClass = `${containerClass} ${clazz}`;
        }
        return containerClass;
    }
}

InputComponent.propTypes = {
    containerClass: React.PropTypes.string,
    listName: React.PropTypes.string
};

InputComponent.defaultProps = {
    containerClass: '',
    listName: 'options'
};
