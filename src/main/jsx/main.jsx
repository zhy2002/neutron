import React from "react";
import ReactDOM from "react-dom";
import App from "./App.jsx";

window.startReact = function () {
    ReactDOM.render(<App />, document.getElementById('app'));
};
