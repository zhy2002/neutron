import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../common/SimpleListComponent';
import MotorVehicleComponent from './MotorVehicleComponent';

function createItemComponent(item) {
    return <MotorVehicleComponent key={item.getUniqueId()} model={item}/>;
}

function MotorVehicleListComponent(props) {
    return (
        <SimpleListComponent
            className={props.componentClass}
            title="Motor Vehicles"
            model={props.model}
            createItemComponent={createItemComponent}
        />
    );
}

export default NeutronHoc(MotorVehicleListComponent);
