import React from 'react';
import PropTypes from 'prop-types';
import NeutronComponent from './NeutronComponent';

export default class ItemIndexComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.itemCount = this.model.getItemCount();
        newState.nodeLabel = this.model.getNodeLabel();
        return newState;
    }

    render() {
        return (
            <span className="item-index-component">
                {this.state.nodeLabel} ({this.props.index + 1} of {this.state.itemCount})
            </span>
        );
    }
}

ItemIndexComponent.propTypes = {
    index: PropTypes.number.isRequired
};
