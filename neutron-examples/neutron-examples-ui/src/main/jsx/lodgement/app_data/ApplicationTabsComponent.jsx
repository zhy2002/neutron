import React from 'react';
import ModelTabsComponent from '../../bootstrap3/ModelTabsComponent';

export default class ApplicationTabsComponent extends React.PureComponent {

    renderTabs() {
        const model = this.props.model;
        if (['PersonNode', 'CompanyNode', 'RealEstateNode', 'ProductNode'].indexOf(model.getConcreteClassName()) >= 0) {
            return <ModelTabsComponent model={model}/>;
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
