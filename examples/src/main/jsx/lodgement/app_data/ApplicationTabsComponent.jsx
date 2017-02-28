import React from 'react';
import PersonTabsComponent from '../app_data/person_data/PersonTabsComponent';
import CompanyTabsComponent from '../app_data/company_data/CompanyTabsComponent';


export default class ApplicationTabsComponent extends React.PureComponent {

    renderTabs() {
        const model = this.props.model;
        if (model.getConcreteClassName() === 'PersonNode') {
            return <PersonTabsComponent model={model}/>;
        }
        if (model.getConcreteClassName() === 'CompanyNode') {
            return <CompanyTabsComponent model={model}/>;
        }
        return null;
    }

    render() {
        const child = this.renderTabs();
        const className = child ? 'has-content' : '';
        return (
            <div className={`application-tabs-component ${className}`}>
                {this.renderTabs()}
            </div>
        );
    }
}

ApplicationTabsComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
