import React from "react";

export default function FormField(props) {
    var id = props["id"];
    var label = props["label"];
    var model = props["model"];

    console.log('hello field');

    return (
        <div className="form-group">
            <label htmlFor={id}>{label}</label>
            <input type="text" className="form-control" id={id}
                   value={model.getValue()} onChange={(event)=> {
                model.setValue(event.target.value);
                window.doUpdate();
            }}/>
            <p className="help-block">Example block-level help text here.</p>
        </div>
    );
}