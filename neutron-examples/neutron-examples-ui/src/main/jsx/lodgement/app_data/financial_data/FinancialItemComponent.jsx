import React from 'react';
import PropTypes from 'prop-types';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import CloseIconComponent from '../../../bootstrap3/CloseIconComponent';
import OwnershipListComponent from '../common/OwnershipListComponent';


export default class FinancialItemComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.delete = () => {
            if (window.confirm(`Are you sure you want to remove this ${this.model.getNodeLabel()}`)) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    render() {
        const model = this.model;
        return (
            <div className={`well ${this.props.className}`}>
                <div className="row">
                    <div className="col-md-7">
                        {this.props.children}
                    </div>
                    <div className="col-md-5">
                        <CloseIconComponent onClose={this.delete}/>
                        <OwnershipListComponent model={model.getOwnershipListNode()}/>
                    </div>
                </div>
            </div>
        );
    }
}

FinancialItemComponent.propTypes = {
    children: PropTypes.any.isRequired,
    className: PropTypes.string.isRequired
};

