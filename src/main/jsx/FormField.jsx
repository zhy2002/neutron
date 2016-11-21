import React from "react";

export default class FormField extends React.Component {

    constructor(props) {
        super(props);

        //const fields
        this.id = props["id"];
        this.label = props["label"];
        this.model = props["model"];
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
    }

    extractNewState() {
        console.log('extract new state');
        var newState = {};
        newState.value = this.model.getValue();
        return newState;
    }

    componentDidMount() {
        console.log("form field did mount");
    }

    onUiNodeChanged() {
        var newState = this.extractNewState();
        this.setState(newState);
    }

    render() {
        var model = this.model;
        //only read from fields and state
        return (
            <div className="form-group">
                <label htmlFor={this.id}>{this.label}</label>
                <input type="text" className="form-control" id={this.id}
                value={this.state.value} onChange={(event)=> {
                 model.setValue(event.target.value);
                }}/>
                <p className="help-block">Example block-level help text here.</p>
            </div>
        );
    }
}