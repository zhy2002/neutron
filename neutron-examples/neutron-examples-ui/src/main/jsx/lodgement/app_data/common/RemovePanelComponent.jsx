import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import ItemIndexComponent from '../../../bootstrap3/ItemIndexComponent';


export default class RemovePanelComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            if (window.confirm(`Are you sure you want to delete this ${this.label} record?`)) {
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
            <div className="remove-panel-component">
                <div className="container-fluid compact">
                    <div className="row">
                        <div className="col-md-2">
                            <button className="btn btn-sm btn-warning pull-right" onClick={this.removeItem}>
                                Remove
                            </button>
                        </div>
                        <div className="col-md-10">
                            <ItemIndexComponent index={this.model.getIndex()} model={this.model.getParent()}/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-offset-2 col-md-10">
                            {this.props.children}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

RemovePanelComponent.propTypes = {
    children: React.PropTypes.any.isRequired
};
