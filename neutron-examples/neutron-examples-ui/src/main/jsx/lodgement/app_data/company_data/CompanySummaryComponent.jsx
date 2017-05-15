import React from 'react';
import RemovePanelComponent from '../common/RemovePanelComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';


export default class CompanySummaryComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.selectItem = () => {
            this.model.getContext().getRootNode().setContentNode(this.model);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.name = this.model.getNodeLabel();
        const companyGeneralNode = this.model.getCompanyGeneralNode();
        if (companyGeneralNode) {
            newState.isPrimary = companyGeneralNode.getCompanyPrimaryApplicantFlagNode().getValue();
        }
        return newState;
    }

    render() {
        const model = this.model;
        const companyGeneralNode = model.getCompanyGeneralNode();

        return (
            <RemovePanelComponent className="company-summary-component" model={model}>
                <div className="row">
                    <div className="col-xs-12">
                        <div className="row company-name">
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
                                <TextInputComponent model={companyGeneralNode.getCompanyAbnNode()} readonly/>
                            </div>
                            <div className="col-xs-3">
                                <TextInputComponent model={companyGeneralNode.getCompanyAcnNode()} readonly/>
                            </div>
                        </div>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }
}
