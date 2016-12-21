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
            <RegisterComponent id="exampleRegister" model={model}/>
        </div>
    );
}

export default App;