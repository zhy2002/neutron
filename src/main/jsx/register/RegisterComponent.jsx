import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";
import FormFieldComponent from "../TextFieldComponent.jsx";
import FormCheckboxComponent from "../CheckboxFieldComponent.jsx";
import NumberFieldComponent from "../NumberFieldComponent.jsx";
import AddressComponent from "./AddressComponent.jsx";
import ErrorListComponent from "./ErrorListComponent.jsx";


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
                        <FormFieldComponent id="exampleUsername" label="Username" model={model.getUsernameNode()}/>
                        <FormFieldComponent id="exampleEmail" label="Email address" model={model.getEmailNode()}/>
                        <FormFieldComponent id="examplePassword" label="Password" model={model.getPasswordNode()}/>
                        <FormFieldComponent id="exampleRepeatPassword" label="Repeat Password"
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