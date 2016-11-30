import React from "react";
import FormFieldComponent from "./FormFieldComponent.jsx";
import FormCheckboxComponent from "./FormCheckboxComponent.jsx";
import ErrorListComponent from "./ErrorListComponent.jsx";


function createRoot(component) {
    var GWT = window["GWT"];
    var root = GWT.RegisterNodeFactory.create();
    window.root = root; //for debugging
    console.log(root);
    return root;
}

export default class RegisterComponent extends React.Component {

    constructor(props) {
        super(props);

        this.model = createRoot(this);
    }

    render() {
        var model = this.model;
        return (
            <div>
                <form>
                    <FormFieldComponent id="exampleUsername" label="Username" model={model.getUsernameNode()}/>
                    <FormFieldComponent id="exampleEmail" label="Email address" model={model.getEmailNode()}/>
                    <FormFieldComponent id="examplePassword" label="Password" model={model.getPasswordNode()}/>
                    <FormFieldComponent id="exampleRepeatPassword" label="Repeat Password" model={model.getRepeatPasswordNode()}/>
                    <FormCheckboxComponent id="exampleReceiveOffers" label="Receive latest offers" model={model.getReceiveOffersNode()} />

                    <button type="button" className="btn btn-default" onClick={()=>{
                        console.log('clicked');
                        model.refresh();
                    }}>Refresh</button>
                </form>
                <ErrorListComponent model={model.getErrorListNode()}/>
            </div>
        );
    }
}