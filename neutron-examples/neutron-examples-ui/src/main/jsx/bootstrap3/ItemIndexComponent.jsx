import React from 'react';
import NeutronComponent from './NeutronComponent';

export default class ItemIndexComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.text = this.model.getItemCount();
        return newState;
    }

    render() {
        return (
            <span className="item-index-component">
                {this.label} ({this.props.index + 1} of {this.state.text})
            </span>
        );
    }
}

ItemIndexComponent.propTypes = {
    index: React.PropTypes.number.isRequired
};
