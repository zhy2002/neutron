import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';

export default class PersonOtherIncomeComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            if (window.confirm('Are you sure you want to delete this other income record?')) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    render() {
        const model = this.model;
        return (
            <div className="person-other-income-component">
                <div className="container-fluid compact">
                    <div className="row">
                        <div className="col-md-2">
                            <button className="btn btn-sm btn-warning pull-right" onClick={this.removeItem}>
                                Remove
                            </button>
                        </div>
                        <div className="col-md-10">
                            <div className="container-fluid">
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
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
