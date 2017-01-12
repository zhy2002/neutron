import React from 'react';
import {RadioButton, RadioButtonGroup} from 'material-ui/RadioButton';
import InputComponent from './InputComponent';
import FieldErrorMessageComponent from './FieldErrorMessageComponent';


const buttonGroupStyle = {
    marginTop: '30px',
    display: 'flex'
};

const buttonStyle = {
    width: 'auto',
    paddingRight: '1em'
};

export default class RadioInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event, value) => {
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
                if (item.getValue()) {
                    options.push(
                        <RadioButton
                            key={item.getValue()}
                            label={item.getText()}
                            style={buttonStyle}
                            labelStyle={this.state.style}
                            value={item.getValue()}
                        />
                    );
                }
            });
        }
        return options;
    }

    render() {
        const options = this.renderOptions();
        console.log('Radio options');

        return (
            <div className="row material-field">
                <div
                    className="medium-12 columns"
                    id={this.id}
                    tabIndex="0"
                >
                    <p style={this.state.style}>{this.label}</p>
                    <RadioButtonGroup
                        style={buttonGroupStyle}
                        name={this.id}
                        valueSelected={this.state.value}
                        onChange={this.updateValue}
                        label="sss"
                    >
                        {options}
                    </RadioButtonGroup>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }
}
