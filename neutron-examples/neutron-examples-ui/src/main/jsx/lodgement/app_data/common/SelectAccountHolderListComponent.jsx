import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


export default class SelectAccountHolderListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        const model = this.model;
        model.getChildren().forEach(
            (node) => {
                const referencedNode = node.getAccountHolderReferenceNode().getReferencedNode();
                result.push(
                    <li className="list-group-item" key={referencedNode.getUniqueId()}>
                        <div className="clearfix">
                            <div className="pull-left">
                                <CheckboxInputComponent model={node.getSelectAccountHolderFlagNode()} hideLabel/>
                            </div>
                            <div className="pull-right">
                                <NodeLabelComponent model={referencedNode}/>
                            </div>
                        </div>
                    </li>
                );
            }
        );
        return result;
    }

    render() {
        return (
            <div className="select-account-holder-list-component">
                <p>{this.state.label}</p>
                <ul className="list-group">
                    {this.renderItems()}
                </ul>
            </div>
        );
    }
}
