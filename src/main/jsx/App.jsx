import React from "react";
import RegisterComponent from "./RegisterComponent.jsx";


function App(props) {
    return (
        <div className="container">
            <div className="col-md-6 col-md-offset-3">
                <h3>Example register form:</h3>
                <RegisterComponent/>
            </div>
        </div>
    );
}

export default App;