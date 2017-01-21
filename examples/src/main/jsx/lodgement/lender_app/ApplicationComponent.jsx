import React from 'react';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';
import PersonListComponent from '../lender_app/PersonListComponent';


export default class ApplicationComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            currentModel: props.model.getPersonListNode()
        };

        this.navigate = (currentModel) => {
            this.setState({
                currentModel
            });
        };
    }

    renderMenu() {
        const model = this.props.model;
        return (
            <nav className="navbar navbar-default">
                <div className="container-fluid">
                    <ul className="nav navbar-nav">
                        <NavDropdownComponent onSelect={this.navigate} model={model.getPersonListNode()}>
                            Person
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getCompanyListNode()}>
                            Company
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getFinancialPositionNode()}>
                            Financial Position
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getRealEstateListNode()}>
                            Real Estates
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getProductsNode()}>
                            Products
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getAdditionalNode()}>
                            Additional
                        </NavDropdownComponent>
                        <NavDropdownComponent onSelect={this.navigate} model={model.getSubmissionNode()}>
                            Submission
                        </NavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }

    renderMainContent() {
        const model = this.state.currentModel;
        const modelName = model.getName();

        if (modelName === 'personListNode')
            return <PersonListComponent model={model}/>;

        return (
            <div>View not defined for model: {model.getSimpleClassName()}</div>
        );
    }

    render() {
        return (
            <div className="application-component">
                <div className="menu">
                    {this.renderMenu()}
                </div>
                <div className="main-content">
                    {this.renderMainContent()}
                </div>
            </div>
        );
    }
}

ApplicationComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
