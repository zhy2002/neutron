import React from 'react';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SavingAccountListComponent from './SavingAccountListComponent';
import MotorVehicleListComponent from './MotorVehicleListComponent';
import OtherAssetListComponent from './OtherAssetListComponent';

export default class AssetsComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="assets-component">
                <PanelComponent title="Assets">
                    <SavingAccountListComponent model={model.getSavingsAccountListNode()}/>
                    <MotorVehicleListComponent model={model.getMotorVehicleListNode()}/>
                    <OtherAssetListComponent model={model.getOtherAssetListNode()}/>
                </PanelComponent>
            </div>
        );
    }

}
