import React from 'react';
import PropTypes from 'prop-types';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';

export default class SimpleListComponent extends ListNeutronComponent {

    constructor(props) {
        super(props);

        this.createItem = () => {
            this.model.createItem();
        };
    }

    renderItems() {
        const model = this.model;
        const result = [];
        for (let i = 0; i < model.getItemCount(); i++) {
            const item = model.getItem(i);
            result.push(this.props.createItemComponent(item));
        }
        return result;
    }

    render() {
        return (
            <div className="simple-list-component">
                <PanelComponent title={this.props.title} onAdd={this.createItem}>
                    {this.renderItems()}
                </PanelComponent>
            </div>
        );
    }
}

SimpleListComponent.propTypes = {
    title: PropTypes.string.isRequired,
    createItemComponent: PropTypes.func.isRequired
};
