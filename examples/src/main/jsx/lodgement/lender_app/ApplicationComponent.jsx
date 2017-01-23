import React from 'react';
import NavDropdownComponent from '../../bootstrap3/NavDropdownComponent';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import PersonListComponent from '../lender_app/PersonListComponent';
import PersonComponent from '../lender_app/person_data/PersonComponent';
import ApplicationErrorsComponent from '../lender_app/ApplicationErrorsComponent';


export default class ApplicationComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.state.currentModel = this.model.getPersonListNode();

        this.navigate = (currentModel) => {
            this.setState({
                currentModel
            });
        };

        this.hideErrorList = () => {
            this.model.setShowErrorList(false);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.showErrorList = this.model.getShowErrorList();

        return newState;
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
        const className = model.getSimpleClassName();

        if (className === 'PersonListNode')
            return <PersonListComponent model={model}/>;

        if (className === 'PersonNode')
            return <PersonComponent model={model}/>;

        return (
            <div>View not defined for model: {className}</div>
        );
    }

    renderErrors() {
        if (this.state.showErrorList) {
            return (
                <div className="application-errors">
                    <div className="title-bar">
                        <a tabIndex="0" onClick={this.hideErrorList} alt="Close">
                            <span className="glyphicon glyphicon-remove"/>
                        </a>
                    </div>
                    <ApplicationErrorsComponent model={this.model.getErrorListNode()}/>
                </div>
            );
        }
        return null;
    }

    render() {
        return (
            <div className="application-component">
                <div className="application-menu">
                    {this.renderMenu()}
                </div>
                <div className="application-main-content">
                    {this.renderMainContent()}
                </div>
                {this.renderErrors()}
            </div>
        );
    }
}

ApplicationComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
