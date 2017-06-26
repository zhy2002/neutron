import React from 'react';
import NeutronCompositeHoc from '../../../neutron/NeutronCompositeHoc';
import NodeLabelComponent from '../../../neutron/NodeLabelComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import ErrorMessageComponent from '../../../bootstrap3/ErrorMessageComponent';


function MonthYearComponent({model, componentClass, stateClass, readonly, disabled, errorMessages}) {
    function resetMonthYear() {
        model.resetValue();
    }

    return (
        <div
            id={model.getUniqueId()}
            tabIndex="0"
            className={`${componentClass} ${stateClass}`}
        >
            <label htmlFor={model.getMonthNode().getUniqueId()}>
                <NodeLabelComponent model={model}/>
            </label>
            <button className="link" onClick={resetMonthYear} disabled={readonly || disabled}>
                <span className="glyphicon glyphicon-erase"/>
            </button>
            <div className="clearfix">
                <SelectInputComponent
                    noLabel
                    label="Select Month"
                    model={model.getMonthNode()}
                    className="month"
                    readonly={readonly}
                />
                <SelectInputComponent
                    noLabel
                    label="Select Year"
                    model={model.getYearNode()}
                    className="year"
                    readonly={readonly}
                />
            </div>
            <ErrorMessageComponent messages={errorMessages}/>
        </div>
    );
}

export default NeutronCompositeHoc(MonthYearComponent);
