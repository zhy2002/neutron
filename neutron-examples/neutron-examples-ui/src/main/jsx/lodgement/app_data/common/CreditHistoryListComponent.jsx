import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CreditHistoryComponent from './CreditHistoryComponent';

function renderItems(model) {
    return model.getChildren().map(
        item => <CreditHistoryComponent key={item.getUniqueId()} model={item}/>
    );
}

class CreditHistoryListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.createNewItem = () => {
            const item = this.props.model.createItem();
            this.componentDidUpdateCallback = () => {
                const dom = document.getElementById(item.getUniqueId());
                if (dom && dom.focus) {
                    dom.focus();
                }
            };
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
            <div className="credit-history-list-component">
                <div className="row">
                    <div className="col-xs-2">
                        <button className="btn btn-sm btn-primary pull-right" onClick={this.createNewItem}>
                            Add
                        </button>
                    </div>
                    <div className="col-xs-10">
                        Credit Histories ({this.props.count})
                    </div>
                </div>
                {renderItems(this.props.model)}
            </div>
        );
    }
}

export default NeutronHoc(
    CreditHistoryListComponent,
    (model) => {
        const props = {};
        props.count = model.getItemCount();
        return props;
    }
);
