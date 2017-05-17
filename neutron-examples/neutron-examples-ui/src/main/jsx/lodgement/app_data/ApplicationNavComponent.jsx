import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';

export default class ApplicationNavComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.onSelect = (currentModel) => {
            this.model.setContentNode(currentModel);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.contentNode = this.model.getContentNode();
        while (newState.contentNode) {
            if (newState.contentNode.getParent() === this.model)
                break;

            newState.contentNode = newState.contentNode.getParent();
        }
        return newState;
    }

    render() {
        const model = this.model;

        return (
            <nav className="navbar navbar-inverse application-nav-component">
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getPersonListNode()}
                            selected={this.state.contentNode === model.getPersonListNode()}
                        >
                            <span className="glyphicon glyphicon-user"/> Person
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getCompanyListNode()}
                            selected={this.state.contentNode === model.getCompanyListNode()}
                        >
                            <span className="glyphicon glyphicon-road"/> Company
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getFinancialPositionNode()}
                            selected={this.state.contentNode === model.getFinancialPositionNode()}
                        >
                            <span className="glyphicon glyphicon-credit-card"/> Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getRealEstateListNode()}
                            selected={this.state.contentNode === model.getRealEstateListNode()}
                        >
                            <span className="glyphicon glyphicon-home"/> Real Estates
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getProductsNode()}
                            childList={model.getProductsNode().getProductListNode()}
                            childItems={[
                                model.getProductsNode().getProductCustomerContributionListNode(),
                                model.getProductsNode().getProductFeeListNode()
                            ]}
                            selected={this.state.contentNode === model.getProductsNode()}
                        >
                            <span className="glyphicon glyphicon-apple"/> Products
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getAdditionalNode()}
                            childItems={[
                                model.getAdditionalNode().getAdditionalCommentNode()
                            ]}
                            childList={model.getAdditionalNode().getRelatedPartyListNode()}
                            selected={this.state.contentNode === model.getAdditionalNode()}
                        >
                            <span className="glyphicon glyphicon-cog"/> Additional
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getSubmissionNode()}
                            selected={this.state.contentNode === model.getSubmissionNode()}
                        >
                            <span className="glyphicon glyphicon-arrow-up"/> Submission
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
