import React from "react";
import FormField from "./FormField.jsx";
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
                    <FormField id="exampleUsername" label="Username" model={model.getUsernameNode()}/>
                    <FormField id="exampleEmail" label="Email address" model={model.getEmailNode()}/>

                    <div className="form-group">
                        <label htmlFor="examplePassword">Password</label>
                        <input type="password" className="form-control" id="examplePassword"
                               placeholder="Password"/>
                    </div>
                    <div className="checkbox">
                        <label>
                            <input type="checkbox"/> Check me out
                        </label>
                    </div>
                    <button type="button" className="btn btn-default">Submit
                    </button>
                </form>
                <ErrorListComponent model={model.getErrorListNode()}/>
            </div>
        );
    }
}