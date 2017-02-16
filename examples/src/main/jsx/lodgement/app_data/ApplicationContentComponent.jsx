import React from 'react';
import PersonListComponent from './PersonListComponent';
import PersonComponent from './person_data/PersonComponent';
import FinancialPositionComponent from './financial_data/FinancialPositionComponent';

export default class ApplicationContentComponent extends React.PureComponent {

    renderContent() {
        const model = this.props.model;
        console.log('ApplicationContentComponent render');
        console.log(model);
        const className = model.getSimpleClassName();

        if (className === 'PersonListNode')
            return <PersonListComponent model={model}/>;

        if (className === 'PersonNode')
            return <PersonComponent model={model} />;

        if (className === 'FinancialPositionNode')
            return <FinancialPositionComponent model={model} />;

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
