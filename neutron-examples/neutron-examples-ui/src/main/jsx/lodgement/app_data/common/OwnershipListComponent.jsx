import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


export default class OwnershipListComponent extends ListNeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.totalPercentage = this.model.getTotalOwnership().toString();
        return newState;
    }

    renderItems() {
        const result = [];
        const model = this.model;
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

    render() {
        return (
            <div className="ownership-list-component">
                <label htmlFor={this.model.getUniqueId()} >{this.state.label}</label>
                <ul className="list-group">
                    {this.renderItems()}
                </ul>
                <div className="clearfix">
                    <div className="pull-left">
                        <span>Total:</span>
                    </div>
                    <div className="pull-right ownership-percentage-wrapper total-percentage-container">
                        <div className="form-group form-group-sm number-input-component">
                            <div className="input-group">
                                <input
                                    type="text"
                                    className="form-control"
                                    id={this.model.getUniqueId()}
                                    readOnly
                                    value={this.state.totalPercentage}
                                />
                                <div className="input-group-addon">%</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }

}
