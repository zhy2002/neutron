import React from "react";
import SelectField from "material-ui/SelectField";
import MenuItem from "material-ui/MenuItem";
import InputComponent from "./InputComponent.jsx";


export default class SelectInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    initialize(props) {
        super.initialize(props);

        this.listName = props["listName"];
        if (!this.listName) {
            this.listName = "options";
        }
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        let model = this.model;
        let options = [];
        let list = model.getStateValue(this.listName);
        if (list) {
            for (let i = 0; i < list.length; i++) {
                let item = list[i];
                options.push(<MenuItem key={item.getValue()} value={item.getValue()} primaryText={item.getText()}/>);
            }
        }

        return (
            <div className="row material-field">
                <div className="medium-12 columns" style={this.state.columnStyle}>
                    <SelectField
                        id={model.getUniqueId()}
                        fullWidth={true}
                        floatingLabelText={this.state.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={(event, index, value) => {
                            model.setValue(value)
                        }}
                        errorText={this.state.errorMessage}
                    >
                        {options}
                    </SelectField>
                </div>
            </div>
        );
    }

    componentDidMount() {
        document.getElementById(this.model.getUniqueId()).tabIndex = 0;
    }

}

InputComponent.propTypes = {
    listName: React.PropTypes.string
};