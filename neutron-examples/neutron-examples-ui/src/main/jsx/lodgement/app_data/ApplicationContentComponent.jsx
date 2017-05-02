import React from 'react';
import PersonListComponent from './person_data/PersonListComponent';
import PersonComponent from './person_data/PersonComponent';
import FinancialPositionComponent from './financial_data/FinancialPositionComponent';
import AdditionalComponent from './additional_data/AdditionalComponent';
import AdditionalCommentComponent from './additional_data/AdditionalCommentComponent';
import RelatedPartyComponent from './additional_data/RelatedPartyComponent';
import CompanyComponent from './company_data/CompanyComponent';
import CompanyListComponent from './company_data/CompanyListComponent';
import RealEstateListComponent from './realestate_data/RealEstateListComponent';
import RealEstateComponent from './realestate_data/RealEstateComponent';
import ProductComponent from './product_data/ProductComponent';
import ProductsComponent from './product_data/ProductsComponent';
import ProductFeeListComponent from './product_data/ProductFeeListComponent';
import ProductCustomerContributionListComponent from './product_data/ProductCustomerContributionListComponent';
import SubmissionComponent from './submission_data/SubmissionComponent';
import LocationService from '../services/LocationService';


export default class ApplicationContentComponent extends React.PureComponent {

    componentDidMount() {
        LocationService.updateHash(this.props.model);
    }

    componentDidUpdate() {
        LocationService.updateHash(this.props.model);
    }

    renderContent() {
        const model = this.props.model;
        const className = model.getConcreteClassName();

        if (className === 'PersonListNode')
            return <PersonListComponent model={model}/>;

        if (className === 'PersonNode')
            return <PersonComponent model={model}/>;

        if (className === 'CompanyListNode')
            return <CompanyListComponent model={model}/>;

        if (className === 'CompanyNode')
            return <CompanyComponent model={model}/>;

        if (className === 'FinancialPositionNode')
            return <FinancialPositionComponent model={model}/>;

        if (className === 'RealEstateListNode')
            return <RealEstateListComponent model={model}/>;

        if (className === 'RealEstateNode')
            return <RealEstateComponent model={model}/>;

        if (className === 'ProductsNode')
            return <ProductsComponent model={model}/>;

        if (className === 'ProductNode')
            return <ProductComponent model={model}/>;

        if (className === 'AdditionalNode')
            return <AdditionalComponent model={model}/>;

        if (className === 'RelatedPartyNode')
            return <RelatedPartyComponent model={model}/>;

        if (className === 'AdditionalCommentNode')
            return <AdditionalCommentComponent model={model}/>;

        if (className === 'SubmissionNode')
            return <SubmissionComponent model={model}/>;

        if (className === 'ProductFeeListNode')
            return <ProductFeeListComponent model={model}/>;

        if (className === 'ProductCustomerContributionListNode')
            return <ProductCustomerContributionListComponent model={model}/>;

        return (
            <div>View not defined for model: {className}</div>
        );
    }

    render() {
        return (
            <div className="application-content-component">
                {this.renderContent()}
            </div>
        );
    }
}

ApplicationContentComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
