import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CommonUtil from '../../../neutron/CommonUtil';
import CreditHistoryComponent from './CreditHistoryComponent';


class CreditHistoryListComponent extends React.PureComponent {

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
        if (this.props.disabled)
            return null;

        return (
            <div className={this.props.componentClass}>
                <div className="row">
                    <div className="col-xs-2">
                        <button className="btn btn-sm btn-primary pull-right" onClick={this.createNewItem}>
                            Add
                        </button>
                    </div>
                    <div className="col-xs-10">
                        Credit History ({this.props.count})
                    </div>
                </div>
                {CommonUtil.renderItems(this.props.model, CreditHistoryComponent)}
            </div>
        );
    }
}

export default NeutronHoc(
    CreditHistoryListComponent,
    (model) => {
        const props = {};
        props.count = model.getItemCount();
        props.disabled = model.isEffectivelyDisabled();
        return props;
    }
);
