import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MainContentComponent from '../common/MainContentComponent';
import AddressComponent from '../common/AddressComponent';
import OwnershipListComponent from '../common/OwnershipListComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';


function PropertyComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-4">
                    <CheckboxInputComponent model={model.getRentedFlagNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getPropertyWeeklyRentNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <NumberInputComponent model={model.getEstimatedMarketValueNode()}/>
                </div>
                <div className="col-md-4">
                    <NumberInputComponent model={model.getContractPriceNode()}/>
                </div>
                <div className="col-md-4">
                    <RadioInputComponent model={model.getDefenseServiceFlagNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <SelectInputComponent model={model.getPropertyTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <SelectInputComponent model={model.getPropertySubTypeNode()}/>
                </div>
                <div className="col-md-4">
                    <RadioInputComponent model={model.getPropertyPurseNode()}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-4">
                    <AddressComponent model={model.getPropertyAddressNode()}/>
                </div>
                <div className="col-md-4">
                    <OwnershipListComponent model={model.getPropertyOwnershipListNode()}/>
                </div>
                <div className="col-md-4"/>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(PropertyComponent);
