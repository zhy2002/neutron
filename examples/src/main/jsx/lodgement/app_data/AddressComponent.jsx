import React from 'react';
import NeutronComponent from '../../materialui/NeutronComponent';
import FieldErrorMessageComponent from '../../materialui/FieldErrorMessageComponent';
import TextInputComponent from '../../materialui/TextInputComponent';
import SelectInputComponent from '../../materialui/SelectInputComponent';


const inputColumnStyle = {
    paddingLeft: '0'
};

const columnStyle = {
    padding: '0'
};

export default class AddressComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div id={this.id} tabIndex="0" className="row expanded address">
                <div className="small-12 columns">
                    <p style={this.state.style}>{this.label}</p>
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
