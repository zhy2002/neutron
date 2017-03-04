import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import RemovePanelComponent from '../common/RemovePanelComponent';

export default class PersonOtherIncomeComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <RemovePanelComponent model={model} className="person-other-income-component">
                <div className="row">
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getOtherIncomeTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <SelectInputComponent model={model.getOtherIncomeAddBackTypeNode()}/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getOtherIncomeAmountNode()}/>
                    </div>
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getOtherIncomePreviousYearNode()}/>
                    </div>
                </div>

                <div className="row">
                    <div className="col-md-6">
                        <TextInputComponent model={model.getOtherIncomeDescriptionNode()}/>
                    </div>
                    <div className="col-md-6"/>
                </div>
            </RemovePanelComponent>
        );
    }
}
