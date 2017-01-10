import React from 'react';
import Checkbox from 'material-ui/Checkbox';
import InputComponent from './InputComponent';
import FieldErrorMessageComponent from './FieldErrorMessageComponent';

const style = {
    marginTop: '30px'
};

export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    //todo make a common string input component
    extractNewState() {
        const newState = super.extractNewState();

        newState.value = this.model.getValue();

        return newState;
    }

    render() {
        const model = this.model;

        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <Checkbox
                        id={this.id}
                        style={style}
                        label={this.label}
                        labelStyle={this.state.style}
                        checked={this.state.value}
                        onCheck={(event, isChecked) => {
                            model.setValue(isChecked);
                        }}
                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}
