import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import SavingAccountListComponent from './SavingAccountListComponent';
import MotorVehicleListComponent from './MotorVehicleListComponent';
import OtherAssetListComponent from './OtherAssetListComponent';

function AssetsComponent(props) {
    const model = props.model;
    return (
        <div className={props.componentClass}>
            <PanelComponent title="Assets" className="panel-primary" expandable>
                <SavingAccountListComponent model={model.getSavingsAccountListNode()}/>
                <MotorVehicleListComponent model={model.getMotorVehicleListNode()}/>
                <OtherAssetListComponent model={model.getOtherAssetListNode()}/>
            </PanelComponent>
        </div>
    );
}

export default NeutronHoc(AssetsComponent);