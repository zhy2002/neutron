import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';

export default class ApplicationNavComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <nav className="navbar navbar-default application-nav-component">
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getPersonListNode()}>
                            Person
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getCompanyListNode()}>
                            Company
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getFinancialPositionNode()}>
                            Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getRealEstateListNode()}>
                            Real Estates
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getProductsNode()}>
                            Products
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getAdditionalNode()}>
                            Additional
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.props.onSelect} model={model.getSubmissionNode()}>
                            Submission
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}

ApplicationNavComponent.propTypes = {
    onSelect: React.PropTypes.func.isRequired,
    currentModel: React.PropTypes.object.isRequired
};
