import React from "react";

export default function FormField(props) {
    var id = props["id"];
    var label = props["label"];
    var usernameOnChange = props["changeHandler"];
    var model = props["model"];
    var fieldName = props["fieldName"];

    return (
        <div className="form-group">
            <label htmlFor={id}>{label}</label>
            <input type="text" className="form-control" id={id}
                   value={model.getValue(fieldName)} onChange={usernameOnChange}/>
            <p className="help-block">Example block-level help text here.</p>
        </div>
    );
}