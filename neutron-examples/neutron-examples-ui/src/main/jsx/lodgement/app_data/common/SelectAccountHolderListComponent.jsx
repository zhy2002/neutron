import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


function SelectAccountHolderListComponent(props) {
    const model = props.model;
    return (
        <div className={props.componentClass}>
            <p>{this.state.label}</p>
            <ul className="list-group">
                {
                    model.getChildren().map(
                        (node) => {
                            const referencedNode = node.getAccountHolderReferenceNode().getReferencedNode();
                            return (
                                <li className="list-group-item" key={referencedNode.getUniqueId()}>
                                    <div className="clearfix">
                                        <div className="pull-left">
                                            <CheckboxInputComponent
                                                model={node.getSelectAccountHolderFlagNode()}
                                                hideLabel
                                            />
                                        </div>
                                        <div className="pull-right">
                                            <NodeLabelComponent model={referencedNode}/>
                                        </div>
                                    </div>
                                </li>
                            );
                        }
                    )
                }
            </ul>
        </div>
    );
}

export default NeutronHoc(SelectAccountHolderListComponent);
