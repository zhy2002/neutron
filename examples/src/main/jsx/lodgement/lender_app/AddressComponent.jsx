import React from "react";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import FieldErrorMessageComponent from "../../materialui/FieldErrorMessageComponent.jsx";
import TextInputComponent from "../../materialui/TextInputComponent.jsx";
import SelectInputComponent from "../../materialui/SelectInputComponent.jsx";


const inputColumnStyle = {
    paddingLeft: "0"
};

const columnStyle = {
    padding: "0"
};

export default class AddressComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        const model = this.model;

        return (
            <div id={model.getUniqueId()} tabIndex="0" className="row expanded address">
                <div className="small-12 columns">
                    <label style={this.state.style}>{this.state.label}</label>
                    <div className="row expanded">
                        <div className="small-12 columns" style={columnStyle}>
                            <TextInputComponent columnStyle={inputColumnStyle} model={model.getAddressLineNode()}/>
                        </div>
                    </div>
                    <div className="row expanded">
                        <div className="small-5 columns" style={columnStyle}>
                            <TextInputComponent columnStyle={inputColumnStyle} model={model.getSuburbNode()}/>
                        </div>
                        <div className="small-3 columns" style={columnStyle}>
                            <TextInputComponent columnStyle={inputColumnStyle} model={model.getPostcodeNode()}/>
                        </div>
                        <div className="small-4 columns" style={columnStyle}>
                            <SelectInputComponent columnStyle={inputColumnStyle} model={model.getCountryNode()}/>
                        </div>
                    </div>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                    <br/>
                    <br/>
                </div>
            </div>
        );
    }

}