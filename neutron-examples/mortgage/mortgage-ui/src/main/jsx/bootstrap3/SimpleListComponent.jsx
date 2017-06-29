import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';
import CommonUtil from '../neutron/CommonUtil';
import PanelComponent from './PanelComponent';
import AlertInfoComponent from './AlertInfoComponent';


class SimpleListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.createItem = () => {
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
            <div className={`${props.componentClass} ${props.className}`}>
                <PanelComponent title={props.label} onAdd={this.createItem}>
                    {props.count === 0 ?
                        <AlertInfoComponent>
                            No result
                        </AlertInfoComponent> :
                        CommonUtil.renderItems(props.model, props.itemComponent)
                    }
                </PanelComponent>
            </div>
        );
    }
}

export default NeutronHoc(
    SimpleListComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        props.count = model.getItemCount();
        return props;
    },
    {
        itemComponent: PropTypes.any.isRequired,
        className: PropTypes.string
    },
    {
        className: ''
    }
);
