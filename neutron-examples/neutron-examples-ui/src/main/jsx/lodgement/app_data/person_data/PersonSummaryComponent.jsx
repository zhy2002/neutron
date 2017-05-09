import React from 'react';
import RemovePanelComponent from '../common/RemovePanelComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';


export default class PersonSummaryComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.selectItem = () => {
            this.model.getContext().getRootNode().setContentNode(this.model);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.name = this.model.getNodeLabel();
        const personGeneralNode = this.model.getPersonGeneralNode();
        if (personGeneralNode) {
            newState.isPrimary = personGeneralNode.getPrimaryApplicantFlagNode().getValue();
        }
        return newState;
    }

    render() {
        const model = this.model;
        const personGeneralNode = model.getPersonGeneralNode();

        return (
            <RemovePanelComponent className="person-summary-component" model={model}>
                <div className="row">
                    <div className="col-xs-12">
                        <div className="row person-name" >
                            <div className="col-xs-12">
                                <a tabIndex="0" onClick={this.selectItem}>
                                    {this.state.name}
                                </a>
                                {
                                    this.state.isPrimary &&
                                    <span> (Primary)</span>
                                }
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-3">
                                <SelectInputComponent model={personGeneralNode.getApplicationTypeNode()} readonly/>
                            </div>
                            <div className="col-xs-3">
                                <SelectInputComponent model={personGeneralNode.getMaritalStatusNode()} readonly/>
                            </div>
                        </div>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }

}
