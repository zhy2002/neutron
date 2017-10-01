import React from 'react';
import NeutronHoc from '../../neutron/NeutronHoc';
import ListCache from '../../neutron/ListCache';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';

class ApplicationNavComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.onSelect = (currentModel) => {
            this.props.model.setContentNode(currentModel);
        };

        this.listCache = new ListCache();
    }

    render() {
        const model = this.props.model;
        const props = this.props;

        return (
            <nav className={`${props.componentClass} navbar navbar-inverse`}>
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getPersonListNode()}
                            selected={props.contentNode === model.getPersonListNode()}
                        >
                            <span className="glyphicon glyphicon-user"/> Person
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getCompanyListNode()}
                            selected={props.contentNode === model.getCompanyListNode()}
                        >
                            <span className="glyphicon glyphicon-road"/> Company
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getFinancialPositionNode()}
                            selected={props.contentNode === model.getFinancialPositionNode()}
                        >
                            <span className="glyphicon glyphicon-credit-card"/> Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getRealEstateListNode()}
                            selected={props.contentNode === model.getRealEstateListNode()}
                        >
                            <span className="glyphicon glyphicon-home"/> Real Estates
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getProductsNode()}
                            childList={model.getProductsNode().getProductListNode()}
                            childItems={
                                this.listCache.getList(
                                    'productsItems',
                                    [
                                        model.getProductsNode().getProductCustomerContributionListNode(),
                                        model.getProductsNode().getProductFeeListNode()
                                    ]
                                )
                            }
                            selected={this.props.contentNode === model.getProductsNode()}
                        >
                            <span className="glyphicon glyphicon-apple"/> Products
                        </NavDropdownComponent>
                        <NavDropdownComponent
                            onSelect={this.onSelect}
                            model={model.getAdditionalNode()}
                            childItems={
                                this.listCache.getList(
                                    'additionalItems',
                                    [
                                        model.getAdditionalNode().getAdditionalCommentNode()
                                    ]
                                )
                            }
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

export default NeutronHoc(
    ApplicationNavComponent,
    (model) => {
        const props = {};
        //find with child of root node is the ancestor of the content node.
        props.contentNode = model.getContentNode();
        while (props.contentNode) {
            if (props.contentNode.getParent() === model)
                break;
            props.contentNode = props.contentNode.getParent();
        }
        return props;
    }
);
