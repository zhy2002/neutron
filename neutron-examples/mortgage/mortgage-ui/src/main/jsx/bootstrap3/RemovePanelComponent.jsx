import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';
import ItemIndexComponent from '../neutron/ItemIndexComponent';
import CloseIconComponent from './CloseIconComponent';


class RemovePanelComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            const model = this.props.model;
            if (window.confirm(
                    `Are you sure you want to delete this ${model.getParent().getNodeLabel()} record?`
                )
            ) {
                model.getParent().removeItem(model);
            }
        };
    }

    render() {
        const props = this.props;

        return (
            <div id={props.model.getUniqueId()} className={`${props.componentClass} row ${props.className}`}>
                <div className="col-sm-12">
                    <div className="well">
                        <CloseIconComponent onClose={this.removeItem} title="Remove"/>
                        <h5>
                            <ItemIndexComponent
                                index={props.index}
                                model={props.model.getParent()}
                            />
                        </h5>
                        <div>
                            {props.children}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    RemovePanelComponent,
    (model) => {
        const props = {};
        props.index = model.getIndex();
        return props;
    },
    {
        className: PropTypes.string.isRequired,
        children: PropTypes.any.isRequired
    }
);
