import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";
import TextFieldComponent from "../TextFieldComponent.jsx";
import FormCheckboxComponent from "../CheckboxFieldComponent.jsx";
import NumberFieldComponent from "../NumberFieldComponent.jsx";
import AddressComponent from "./AddressComponent.jsx";
import ErrorListComponent from "./ErrorListComponent.jsx";
import PhoneComponent from "./PhoneComponent.jsx";

export default class RegisterComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();
        newState.hasError = this.model.getHasError();
        return newState;
    }

    render() {
        let model = this.model;

        var alert;
        if (this.state.hasError) {
            alert = <span className="glyphicon glyphicon-alert"/>;
        } else {
            alert = <span/>;
        }

        return (
            <div className="row">
                <div className="col-md-6">
                    <h3>Example Register Form
                        <small>&nbsp;{alert}</small>
                    </h3>
                    <form>
                        <TextFieldComponent id="exampleUsername" label="Username" model={model.getUsernameNode()}/>
                        <TextFieldComponent id="exampleEmail" label="Email address" model={model.getEmailNode()}/>
                        <TextFieldComponent id="examplePassword" label="Password" model={model.getPasswordNode()}/>
                        <TextFieldComponent id="exampleRepeatPassword" label="Repeat Password"
                                            model={model.getRepeatPasswordNode()}/>
                        <NumberFieldComponent id="exampleAge" label="Age" model={model.getAgeNode()}/>
                        <FormCheckboxComponent id="exampleReceiveOffers" label="Receive latest offers"
                                               model={model.getReceiveOffersNode()}/>
                        <FormCheckboxComponent id="exampleOwnInvestmentProperty" label="Own investment property"
                                               model={model.getOwnInvestmentPropertyNode()}/>
                        <AddressComponent id="exampleResidentialProperty" label="Residential Property"
                                          model={model.getResidentialPropertyNode()}/>
                        <AddressComponent id="exampleInvestmentProperty" label="Investment Property"
                                          model={model.getInvestmentPropertyNode()}/>
                        <PhoneComponent id="examplePhone" label="Home Phone" model={model.getHomePhoneNode()} />
                    </form>
                </div>
                <div className="col-md-6">
                    <br/>
                    <div className="row">
                        <div className="col-md-offset-1 col-md-10">
                            <button type="button" className="btn btn-warning" onClick={() => {
                                console.log('clicked');
                                model.refresh();
                            }}>Refresh
                            </button>
                        </div>
                    </div>
                    <hr/>
                    <ErrorListComponent id="exampleErrors" model={model.getErrorListNode()}/>
                </div>
            </div>
        );
    }
}