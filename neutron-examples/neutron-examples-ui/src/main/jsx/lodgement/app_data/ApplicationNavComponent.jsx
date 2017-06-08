import React from 'react';
import NeutronHoc from '../../neutron/NeutronHoc';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';

class ApplicationNavComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onSelect = (currentModel) => {
            this.props.model.setContentNode(currentModel);
        };
    }

    render() {
        const model = this.props.model;

        return (
            <nav className={`${this.props.componentClass} navbar navbar-inverse`}>
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getPersonListNode()}
                            selected={this.props.contentNode === model.getPersonListNode()}
                        >
                            <span className="glyphicon glyphicon-user"/> Person
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getCompanyListNode()}
                            selected={this.props.contentNode === model.getCompanyListNode()}
                        >
                            <span className="glyphicon glyphicon-road"/> Company
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getFinancialPositionNode()}
                            selected={this.props.contentNode === model.getFinancialPositionNode()}
                        >
                            <span className="glyphicon glyphicon-credit-card"/> Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getRealEstateListNode()}
                            selected={this.props.contentNode === model.getRealEstateListNode()}
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
                            selected={this.props.contentNode === model.getProductsNode()}
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
                            selected={this.props.contentNode === model.getAdditionalNode()}
                        >
                            <span className="glyphicon glyphicon-cog"/> Additional
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getSubmissionNode()}
                            selected={this.props.contentNode === model.getSubmissionNode()}
                        >
                            <span className="glyphicon glyphicon-arrow-up"/> Submission
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}

ApplicationNavComponent.propTypes = NeutronHoc.suppressMissingPropTypes();

export default NeutronHoc(
    ApplicationNavComponent,
    (model) => {
        const newState = {};
        //find with child of root node is the ancestor of the content node.
        newState.contentNode = model.getContentNode();
        while (newState.contentNode) {
            if (newState.contentNode.getParent() === model)
                break;

            newState.contentNode = newState.contentNode.getParent();
        }
        return newState;
    }
);
