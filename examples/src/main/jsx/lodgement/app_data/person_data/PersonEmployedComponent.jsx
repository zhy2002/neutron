import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MonthYearComponent from '../common/MonthYearComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';

export default class PersonEmployedComponent extends NeutronComponent {

    render() {
        const model = this.model;
        if (model.isDisabled())
            return null;

        return (
            <div className="container-fluid person-employed-component">
                <div className="row">
                    <div className="col-md-6">
                        <SelectInputComponent model={model.getEmploymentStatusNode()}/>
                    </div>
                    <div className="col-md-6">
                        <TextInputComponent model={model.getOccupationNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-6">
                        <TextInputComponent model={model.getEmployerNameNode()}/>
                    </div>
                    <div className="col-md-6">
                        <TelephoneComponent model={model.getEmployerPhoneNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-6">
                        <AddressComponent model={model.getEmployerAddressNode()}/>
                    </div>
                    <div className="col-md-6">
                        {model.getBusinessTypeNode &&
                        <TextInputComponent model={model.getBusinessTypeNode()}/>
                        }
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-6">
                        <MonthYearComponent model={model.getEmploymentStartedNode()}/>
                    </div>
                    <div className="col-md-6">
                        <MonthYearComponent model={model.getEmploymentEndedNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-6">
                        {model.getGrossYearlySalaryNode &&
                        <NumberInputComponent model={model.getGrossYearlySalaryNode()}/>
                        }
                        {model.getProfitThisYearNode &&
                        <NumberInputComponent model={model.getProfitThisYearNode()}/>
                        }
                    </div>
                    <div className="col-md-6">
                        {model.getProfitPreviousYearNode &&
                        <NumberInputComponent model={model.getProfitPreviousYearNode()}/>
                        }
                    </div>
                </div>
            </div>
        );
    }
}