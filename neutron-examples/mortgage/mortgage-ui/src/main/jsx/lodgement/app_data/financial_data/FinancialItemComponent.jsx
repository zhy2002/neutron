import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CloseIconComponent from '../../../bootstrap3/CloseIconComponent';
import OwnershipListComponent from '../common/OwnershipListComponent';


class FinancialItemComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.delete = () => {
            const model = this.props.model;
            if (window.confirm(`Are you sure you want to delete this ${model.getParent().getNodeLabel()} record?`)) {
                model.getParent().removeItem(model);
            }
        };
    }

    render() {
        const props = this.props;

        return (
            <div className={`${props.componentClass} well ${props.className}`}>
                <div className="row">
                    <div className="col-md-7">
                        {props.children}
                    </div>
                    <div className="col-md-5">
                        <CloseIconComponent onClose={this.delete}/>
                        <OwnershipListComponent model={props.model.getOwnershipListNode()}/>
                    </div>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    FinancialItemComponent,
    undefined,
    {
        children: PropTypes.any.isRequired,
        className: PropTypes.string.isRequired
    }
);