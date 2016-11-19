import React from "react";
import FormField from "./FormField.jsx";

function createRoot(component) {
    var rootState = {
        username: 'shuke',
        email: 'feixing yuan'
    };
    return {
        name: "app test",
        getValue(key) {
            return rootState[key];
        },
        setValue(key, value) {
            rootState[key] = value;
            component.doUpdate();
        }
    };
}

export default class RegisterComponent extends React.Component {

    constructor(props) {
        super(props);

        this.version = 0;
        this.model = createRoot(this);
    }

    doUpdate() {
        this.version = (this.version + 1) % 10000;
        this.setState({version: this.version});
    }

    render() {
        var model = this.model;

        function usernameOnChange(event) {
            var value = event.target.value;
            model.setValue('username', value);
            model.setValue('email', value + '@gmail.com');
        }

        function emailOnChange(event) {
            var value = event.target.value;
            model.setValue('email', value);
        }

        /*
         <div className="form-group">
         <label htmlFor="exampleUsername">Username</label>
         <input type="text" className="form-control" id="exampleUsername"
         value={model.getValue('username')} onChange={usernameOnChange}/>
         <p className="help-block">Example block-level help text here.</p>
         </div>
         */
        return (
            <form>
                <FormField id="exampleUsername" label="Username" model={model} fieldName="username"
                           changeHandler={usernameOnChange}/>
                <FormField id="exampleEmail" label="Email address" model={model} fieldName="email"
                           changeHandler={emailOnChange}/>


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
                <button type="button" className="btn btn-default" onClick={()=> {
                    this.setState({message: 'never mind...'});
                    this.slogan = 'oh no';
                }}>Submit
                </button>
            </form>
        );
    }
}