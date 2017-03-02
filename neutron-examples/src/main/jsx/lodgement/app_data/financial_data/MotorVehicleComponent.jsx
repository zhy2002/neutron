import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class MotorVehicleComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.test = true;
    }

    render() {
        return (
            <div className="motor-vehicle-component">MotorVehicleComponent</div>
        );
    }
}
