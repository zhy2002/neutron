import React from 'react';
import PersonListComponent from './PersonListComponent';
import PersonComponent from './person_data/PersonComponent';
import FinancialPositionComponent from './financial_data/FinancialPositionComponent';
import AdditionalComponent from './additional_data/AdditionalComponent';
import RelatedPartyComponent from './additional_data/RelatedPartyComponent';
import CompanyComponent from './company_data/CompanyComponent';
import CompanyListComponent from './company_data/CompanyListComponent';
import RealEstateListComponent from './realestate_data/RealEstateListComponent';
import RealEstateComponent from './realestate_data/RealEstateComponent';
import ProductComponent from './product_data/ProductComponent';
import ProductsComponent from './product_data/ProductsComponent';


export default class ApplicationContentComponent extends React.PureComponent {

    renderContent() {
        const model = this.props.model;
        console.log('ApplicationContentComponent render');
        console.log(model);
        const className = model.getConcreteClassName();

        if (className === 'PersonListNode')
            return <PersonListComponent model={model}/>;

        if (className === 'PersonNode')
            return <PersonComponent model={model} />;

        if (className === 'CompanyListNode')
            return <CompanyListComponent model={model}/>;

        if (className === 'CompanyNode')
            return <CompanyComponent model={model} />;

        if (className === 'FinancialPositionNode')
            return <FinancialPositionComponent model={model} />;

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
