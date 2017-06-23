import React from 'react';
import PropTypes from 'prop-types';
import AlertInfoComponent from './AlertInfoComponent';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';

function renderItems(props) {
    const items = props.model.getChildren().map(
        item => props.createItemComponent(item)
    );
    if (items.length === 0) {
        items.push(
            <AlertInfoComponent key="no_result">
                No record
            </AlertInfoComponent>
        );
    }
    return items;
}

class SimpleListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.createItem = () => {
            this.props.model.createItem();
        };
    }

    render() {
        const props = this.props;

        return (
            <div className={`${props.componentClass} ${props.className}`}>
                <PanelComponent title={props.title} onAdd={this.createItem}>
                    {renderItems(props)}
                </PanelComponent>
            </div>
        );
    }
}

export default NeutronHoc(
    SimpleListComponent,
    undefined,
    {
        title: PropTypes.string.isRequired,
        createItemComponent: PropTypes.func.isRequired,
        className: PropTypes.string
    },
    {
        className: ''
    }
);
