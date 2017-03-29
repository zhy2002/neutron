import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';

export default class MonthYearComponent extends NeutronComponent {

    render() {
        const model = this.model;
        if (model.getNodeStatus() !== GWT.NodeStatusEnum.Loaded)
            return null;

        return (
            <div
                id={this.id}
                tabIndex="0"
                className={`month-year-component${this.state.componentClass}`}
            >
                <label htmlFor={model.getMonthNode().getUniqueId()}>{this.state.label}</label>
                <div className="clearfix">
                    <SelectInputComponent
                        noLabel
                        label="Select Month"
                        model={model.getMonthNode()}
                        containerClass="month"
                    />
                    <SelectInputComponent
                        noLabel
                        label="Select Year"
                        model={model.getYearNode()}
                        containerClass="year"
                    />
                </div>
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }
}
