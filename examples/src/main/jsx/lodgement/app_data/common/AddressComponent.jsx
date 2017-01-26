import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';


export default class AddressComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div
                id={this.id}
                tabIndex="0"
                className={`address-component${this.state.componentClass}`}
            >
                <label htmlFor={model.getAddressLineNode().getUniqueId()}>{this.label}</label>
                <div className="grouper">
                    <TextInputComponent hideLabel model={model.getAddressLineNode()}/>
                    <div className="clearfix">
                        <TextInputComponent model={model.getSuburbNode()} containerClass="suburb"/>
                        <TextInputComponent model={model.getPostcodeNode()} containerClass="postcode"/>
                        <SelectInputComponent model={model.getCountryNode()} containerClass="country"/>
                    </div>
                </div>
            </div>
        );
    }

}
