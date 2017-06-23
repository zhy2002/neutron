import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../neutron/NodeLabelComponent';

function renderItems(model) {
    const result = [];
    model.getChildren().forEach(
        (node) => {
            const referencedNode = node.getApplicantReferenceNode().getReferencedNode();
            result.push(
                <li className="list-group-item" key={node.getApplicantReferenceNode().getUniqueId()}>
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

function OwnershipListComponent(props) {
    const model = props.model;

    return (
        <div className={props.componentClass}>
            <label htmlFor={model.getUniqueId()}>
                <NodeLabelComponent model={model}/>
            </label>
            <ul className="list-group">
                {renderItems(model)}
            </ul>
            <div className="clearfix">
                <div className="pull-left">
                    <span>Total:</span>
                </div>
                <div className="pull-right ownership-percentage-wrapper total-percentage-container">
                    <p>
                        {props.totalOwnership}%
                    </p>
                </div>
            </div>
        </div>
    );
}

export default NeutronHoc(
    OwnershipListComponent,
    (model) => {
        const props = {};
        props.totalOwnership = model.getTotalOwnership() ? model.getTotalOwnership().toString() : 'NA';
        return props;
    }
);
