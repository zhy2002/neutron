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

    receiveProps(props) {
        super.receiveProps(props);

        //todo make a common base class for both radio and select
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
            list.forEach(item => {
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

        //todo add a label
        return (
            <div
                className="row material-field"
            >
                <div
                    className="medium-12 columns"
                    id={this.id}
                    tabIndex="0"
                >
                    <RadioButtonGroup
                        style={buttonGroupStyle}
                        name={this.id}
                        valueSelected={this.state.value}
                        onChange={(event, value) => {
                            model.setValue(value);
                        }}
                    >
                        {options}
                    </RadioButtonGroup>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}
