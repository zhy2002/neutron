import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';

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
                    {
                        props.model.getChildren().map(
                            item => this.props.createItemComponent(item)
                        )
                    }
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
