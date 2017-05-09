import React from 'react';
import PropTypes from 'prop-types';
import NodeValueComponent from '../../bootstrap3/NodeValueComponent';
import CloseIconComponent from '../../bootstrap3/CloseIconComponent';

export default class AddressListComponent extends React.PureComponent {

    renderItems() {
        const items = [];
        const addressListNode = this.props.contextModel.getRootNode().getAddressRefListNode();
        addressListNode.getUniqueAddressNodes().forEach(
            (item) => {
                items.push(
                    <a className="list-group-item" tabIndex="0" onClick={() => this.props.onSelect(item)}>
                        <NodeValueComponent model={item.getAddressLineNode()}/>
                        <br/>
                        <NodeValueComponent model={item.getSuburbNode()}/>
                        <NodeValueComponent model={item.getPostcodeNode()}/>
                        <NodeValueComponent model={item.getCountryNode()}/>
                    </a>
                );
            }
        );
        return items;
    }

    render() {
        return (
            <div className="address-list-component">
                <div className="overlay-panel">
                    <div className="pull-right">
                        <CloseIconComponent onClose={this.props.onHide}/>
                    </div>
                    <div className="list-group">
                        {this.renderItems()}
                    </div>
                </div>
            </div>
        );
    }
}

AddressListComponent.propTypes = {
    contextModel: PropTypes.object.isRequired,
    onSelect: PropTypes.func.isRequired,
    onHide: PropTypes.func.isRequired
};
