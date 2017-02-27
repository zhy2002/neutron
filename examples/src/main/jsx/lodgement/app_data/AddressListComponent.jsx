import React from 'react';
import NodeValueComponent from '../../bootstrap3/NodeValueComponent';

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
                        <a onClick={this.props.onHide} tabIndex="0" className="close-icon">
                            <span className="glyphicon glyphicon-remove"/>
                        </a>
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
    contextModel: React.PropTypes.object.isRequired,
    onSelect: React.PropTypes.func.isRequired,
    onHide: React.PropTypes.func.isRequired
};
