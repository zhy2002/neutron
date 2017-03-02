import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


export default class OwnershipListComponent extends ListNeutronComponent {

    renderItems() {
        const result = [];
        const model = this.model;
        model.getChildren().forEach(
            (node) => {
                const referencedNode = node.getApplicantReferenceNode().getReferencedNode();
                result.push(
                    <li className="list-group-item" key={referencedNode.getUniqueId()}>
                        <div className="clearfix">
                            <div className="pull-left">
                                <NodeLabelComponent model={referencedNode}/>
                            </div>
                            <div className="pull-right">
                                <CheckboxInputComponent model={node.getAverageFlagNode()} hideLabel/>
                            </div>
                            <div className="pull-right ownership-percentage-wrapper">
                                <NumberInputComponent model={node.getOwnershipPercentageNode()} hideLabel/>
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
            <div className="ownership-list-component">
                <p>Ownership List</p>
                <ul className="list-group">
                    {this.renderItems()}
                </ul>
            </div>
        );
    }

}
