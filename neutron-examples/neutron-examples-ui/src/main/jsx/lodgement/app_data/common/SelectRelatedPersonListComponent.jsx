import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


function SelectRelatedPersonListComponent(props) {
    const model = props.model;

    return (
        <div className={props.componentClass}>
            <p><NodeLabelComponent model={model}/></p>
            <ul className="list-group">
                {
                    model.getChildren().map(
                        (node) => {
                            const referencedNode = node.getRelatedPersonReferenceNode().getReferencedNode();
                            return (
                                <li className="list-group-item" key={referencedNode.getUniqueId()}>
                                    <div className="clearfix">
                                        <div className="pull-left">
                                            <CheckboxInputComponent
                                                model={node.getSelectRelatedPersonFlagNode()}
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

export default NeutronHoc(SelectRelatedPersonListComponent);
