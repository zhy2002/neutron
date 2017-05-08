import React from 'react';
import PropTypes from 'prop-types';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import ItemIndexComponent from '../../../bootstrap3/ItemIndexComponent';


export default class RemovePanelComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            if (window.confirm(
                    `Are you sure you want to delete this ${this.model.getParent().getNodeLabel()} record?`
                )
            ) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.index = this.model.getIndex();
        return newState;
    }

    render() {
        return (
            <div className={`row remove-panel-component ${this.props.className}`}>
                <div className="col-sm-12">
                    <div className="well">
                        <button className="btn btn-sm btn-warning pull-right" onClick={this.removeItem}>
                            Remove
                        </button>
                        <h5>
                            <ItemIndexComponent index={this.model.getIndex()} model={this.model.getParent()}/>
                        </h5>
                        <div>
                            {this.props.children}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

RemovePanelComponent.propTypes = {
    className: PropTypes.string.isRequired,
    children: PropTypes.any.isRequired
};
