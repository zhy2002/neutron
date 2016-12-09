import React from "react";
import RegisterComponent from "./RegisterComponent.jsx";

function createRoot() {
    let GWT = window["GWT"];
    let root = GWT.RegisterNodeFactory.create();

    //for debugging
    window.root = root;
    console.log(root);

    return root;
}

function App(props) {

    let model = createRoot();
    return (
        <div className="container">
            <div className="col-md-6 col-md-offset-3">
                <h3>Example register form:</h3>
                <RegisterComponent id="exampleRegister" model={model}/>
            </div>
        </div>
    );
}

export default App;