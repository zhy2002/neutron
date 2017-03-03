import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SimpleListComponent from '../common/SimpleListComponent';
import MotorVehicleComponent from './MotorVehicleComponent';

function createItemComponent(item) {
    return <MotorVehicleComponent key={item.getUniqueId()} model={item}/>;
}

export default class MotorVehicleListComponent extends NeutronComponent {

    render() {
        return (
            <SimpleListComponent title="Motor Vehicles" model={this.model} createItemComponent={createItemComponent}/>
        );
    }
}
