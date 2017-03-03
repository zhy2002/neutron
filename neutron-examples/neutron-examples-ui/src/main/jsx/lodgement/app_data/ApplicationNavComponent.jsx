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

    render() {
        const model = this.model;
        return (
            <nav className="navbar navbar-default application-nav-component">
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getPersonListNode()}>
                            Person
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getCompanyListNode()}>
                            Company
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getFinancialPositionNode()}>
                            Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getRealEstateListNode()}>
                            Real Estates
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getProductsNode()}>
                            Products
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getAdditionalNode()}>
                            Additional
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.onSelect} model={model.getSubmissionNode()}>
                            Submission
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}

