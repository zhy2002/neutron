import React from 'react';
import PropTypes from 'prop-types';
import {translate} from 'react-i18next';
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
        const {componentClass, className, model, count, label, itemComponent, mapItemToModel, t} = this.props;

        return (
            <div className={`${componentClass} ${className} row`}>
                <div className="col-md-12">
                    <div className="row">
                        <div className="col-md-2">
                            <button
                                id={model.getUniqueId()}
                                className="btn btn-sm btn-primary pull-right"
                                onClick={this.createNewItem}
                            >
                                {t('Add')}
                            </button>
                        </div>
                        <div className="col-md-10">
                            {count === 0 ?
                                <AlertInfoComponent>
                                    Click <em>Add</em> to create a new {label} record.
                                </AlertInfoComponent> :
                                CommonUtil.renderItems(model, itemComponent, mapItemToModel)
                            }
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

const hoc = NeutronHoc(
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

export default translate()(hoc);