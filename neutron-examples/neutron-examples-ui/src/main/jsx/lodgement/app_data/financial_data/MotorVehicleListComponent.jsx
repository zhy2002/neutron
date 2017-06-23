import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SimpleListComponent from '../../../bootstrap3/SimpleListComponent';
import MotorVehicleComponent from './MotorVehicleComponent';


function MotorVehicleListComponent({model, componentClass}) {
    return (
        <SimpleListComponent
            className={componentClass}
            model={model}
            itemComponent={MotorVehicleComponent}
        />
    );
}

export default NeutronHoc(MotorVehicleListComponent);
