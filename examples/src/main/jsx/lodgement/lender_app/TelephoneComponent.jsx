import React from "react";
import {red500} from 'material-ui/styles/colors';

import InputComponent from "../../materialui/InputComponent.jsx";
import FieldErrorMessageComponent from "../../materialui/FieldErrorMessageComponent.jsx";


const columnStyle = {
    paddingLeft: "2px",
    paddingRight: "2px"
};


export default class TelephoneComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.countryCode = "";
        newState.areaCode = "";
        newState.phoneNumber = "";

        const telephone = this.model.getValue();
        if (telephone) {
            if (telephone.getCountryCode()) {
                newState.countryCode = telephone.getCountryCode();
            }
            if (telephone.getAreaCode()) {
                newState.areaCode = telephone.getAreaCode();
            }
            if (telephone.getPhoneNumber()) {
                newState.phoneNumber = telephone.getPhoneNumber();
            }
        }

        if(newState.errorMessage) {
            newState.style.color = red500;
        }

        return newState;
    }

    render() {
        const model = this.model;

        console.log("telephone style is:");
        console.log(this.state.style);

        return (
            <div id={model.getUniqueId()} tabIndex="0" className="row expanded telephone" style={{marginBottom: "16px"}}>
                <div className="small-12 columns" >
                    <label style={this.state.style}>{this.state.label}</label>
                    <div className="row expanded">
                        <div className="small-2 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Country Code"
                                value={this.state.countryCode}
                                onChange={event => {
                                    const value = event.target.value;
                                    const telephone = model.getCopyOfValue();
                                    telephone.setCountryCode(value);
                                    model.setValue(telephone);
                                }}
                                style={this.state.style}
                            />
                        </div>
                        <div className="small-2 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Area Code"
                                value={this.state.areaCode}
                                onChange={event => {
                                    const value = event.target.value;
                                    const telephone = model.getCopyOfValue();
                                    telephone.setAreaCode(value);
                                    model.setValue(telephone);
                                }}
                                style={this.state.style}
                            />
                        </div>
                        <div className="small-8 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Phone Number"
                                value={this.state.phoneNumber}
                                onChange={event => {
                                    const value = event.target.value;
                                    const telephone = model.getCopyOfValue();
                                    telephone.setPhoneNumber(value);
                                    model.setValue(telephone);
                                }}
                                style={this.state.style}
                            />
                        </div>
                    </div>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}

TelephoneComponent.propTypes = {
    label: React.PropTypes.string
};