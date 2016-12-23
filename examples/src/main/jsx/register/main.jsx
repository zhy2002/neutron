import React from "react";
import ReactDOM from "react-dom";
import App from "./App.jsx";

window.startRegister = function () {
    window.fieldMap = {};
    ReactDOM.render(<App />, document.getElementById('app'));
};
