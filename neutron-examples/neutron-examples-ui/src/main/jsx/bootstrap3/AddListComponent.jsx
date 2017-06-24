import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';
import CommonUtil from '../neutron/CommonUtil';
import AlertInfoComponent from './AlertInfoComponent';


class AddListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.createNewItem = () => {
            const item = this.props.model.createItem();
            this.componentDidUpdateCallback = CommonUtil.createFocusOnNodeFunc(item);
        };
    }

    componentDidUpdate() {
        if (this.componentDidUpdateCallback) {
            this.componentDidUpdateCallback();
            delete this.componentDidUpdateCallback;
        }
    }

    render() {
        const props = this.props;

        return (
            <div className={`${props.componentClass} ${props.className} row`}>
                <div className="col-md-12">
                    <div className="row">
                        <div className="col-md-2">
                            <button
                                id={props.model.getUniqueId()}
                                className="btn btn-sm btn-primary pull-right"
                                onClick={this.createNewItem}
                            >
                                Add
                            </button>
                        </div>
                        <div className="col-md-10">
                            {props.count === 0 ?
                                <AlertInfoComponent>
                                    Click <em>Add</em> to create a new {props.label} record.
                                </AlertInfoComponent> :
                                CommonUtil.renderItems(props.model, props.itemComponent, props.mapItemToModel)
                            }
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    AddListComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        props.count = model.getItemCount();
        return props;
    },
    {
        itemComponent: PropTypes.any.isRequired,
        className: PropTypes.string,
        mapItemToModel: PropTypes.func
    },
    {
        className: '',
        mapItemToModel: CommonUtil.mapToSelf
    }
);
