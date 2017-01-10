import React from 'react';
import SelectField from 'material-ui/SelectField';
import MenuItem from 'material-ui/MenuItem';
import InputComponent from './InputComponent';


export default class SelectInputComponent extends InputComponent {

    receiveProps(props) {
        super.receiveProps(props);

        this.listName = props.listName;
        if (!this.listName) {
            this.listName = 'options';
        }
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        const model = this.model;
        const list = model.getStateValue(this.listName);
        const options = [];
        if (list) {
            list.forEach((item) => {
                options.push(<MenuItem key={item.getValue()} value={item.getValue()} primaryText={item.getText()}/>);
            });
        }

        return (
            <div className="row material-field">
                <div className="medium-12 columns" style={this.columnStyle}>
                    <SelectField
                        id={this.id}
                        fullWidth
                        floatingLabelText={this.label}
                        floatingLabelStyle={this.state.style}
                        value={this.state.value}
                        onChange={(event, index, value) => {
                            model.setValue(value);
                        }}
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

InputComponent.propTypes = {
    listName: React.PropTypes.string
};
