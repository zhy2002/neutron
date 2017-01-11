import React from 'react';
import SelectField from 'material-ui/SelectField';
import MenuItem from 'material-ui/MenuItem';
import InputComponent from './InputComponent';


export default class SelectInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event, index, value) => {
            this.model.setValue(value);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.list = this.model.getStateValue(this.props.listName);
        return newState;
    }

    renderOptions() {
        const options = [];
        if (this.state.list) {
            this.state.list.forEach((item) => {
                options.push(<MenuItem key={item.getValue()} value={item.getValue()} primaryText={item.getText()}/>);
            });
        }
        return options;
    }

    render() {
        const options = this.renderOptions();

        return (
            <div className="row material-field">
                <div className="medium-12 columns" style={this.props.columnStyle}>
                    <SelectField
                        id={this.id}
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={this.updateValue}
                        errorText={this.state.errorMessage}
                    >
                        {options}
                    </SelectField>
                </div>
            </div>
        );
    }

    componentDidMount() { //hack to make the select focusable
        document.getElementById(this.id).tabIndex = 0;
    }
}
