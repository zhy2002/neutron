import React from "react";
import NeutronComponent from "../NeutronComponent.jsx";
import FormFieldComponent from "../FormFieldComponent.jsx";
import FormCheckboxComponent from "../FormCheckboxComponent.jsx";
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
            alert = <p><span className="glyphicon glyphicon-alert"/></p>;
        } else {
            alert = <p/>;
        }

        return (
            <div>
                {alert}
                <form>
                    <FormFieldComponent id="exampleUsername" label="Username" model={model.getUsernameNode()}/>
                    <FormFieldComponent id="exampleEmail" label="Email address" model={model.getEmailNode()}/>
                    <FormFieldComponent id="examplePassword" label="Password" model={model.getPasswordNode()}/>
                    <FormFieldComponent id="exampleRepeatPassword" label="Repeat Password" model={model.getRepeatPasswordNode()}/>
                    <NumberFieldComponent id="exampleAge" label="Age" model={model.getAgeNode()}/>
                    <FormCheckboxComponent id="exampleReceiveOffers" label="Receive latest offers" model={model.getReceiveOffersNode()}/>
                    <FormCheckboxComponent id="exampleOwnInvestmentProperty" label="Own investment property" model={model.getOwnInvestmentPropertyNode()}/>
                    <AddressComponent id="exampleResidentialProperty" label="Residential Address" model={model.getResidentialPropertyNode()}/>
                    <AddressComponent id="exampleInvestmentProperty" label="Investment Property Address" model={model.getInvestmentPropertyNode()}/>
                    <button type="button" className="btn btn-default" onClick={() => {
                        console.log('clicked');
                        model.refresh();
                    }}>Refresh
                    </button>
                </form>
                <ErrorListComponent id="exampleErrors" model={model.getErrorListNode()}/>
            </div>
        );
    }
}