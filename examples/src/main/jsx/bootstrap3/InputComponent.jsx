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
}

InputComponent.propTypes = {
    columnStyle: React.PropTypes.object,
    listName: React.PropTypes.string
};

InputComponent.defaultProps = {
    columnStyle: {},
    listName: 'options'
};
