import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import ErrorMessageComponent from '../../../bootstrap3/ErrorMessageComponent';


function MonthYearComponent({model, componentClass, label, errorMessages}) {
    return (
        <div
            id={model.getUniqueId()}
            tabIndex="0"
            className={componentClass}
        >
            <label htmlFor={model.getMonthNode().getUniqueId()}>{label}</label>
            <div className="clearfix">
                <SelectInputComponent
                    noLabel
                    label="Select Month"
                    model={model.getMonthNode()}
                    className="month"
                />
                <SelectInputComponent
                    noLabel
                    label="Select Year"
                    model={model.getYearNode()}
                    className="year"
                />
            </div>
            <ErrorMessageComponent messages={errorMessages}/>
        </div>
    );
}

export default NeutronHoc(
    MonthYearComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        props.errorMessages = model.getValidationMessages();
        return props;
    }
);
