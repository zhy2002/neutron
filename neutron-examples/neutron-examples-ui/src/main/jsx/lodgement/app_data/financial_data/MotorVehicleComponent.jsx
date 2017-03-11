import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


export default class MotorVehicleComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <FinancialItemComponent model={model} className="motor-vehicle-component">
                <div className="row">
                    <div className="col-md-4">
                        <TextInputComponent model={model.getVehicleModelNode()}/>
                    </div>
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getVehicleYearNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getVehicleMarketValueNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}
