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

        this.updateValue = (event, isChecked) => {
            this.model.setValue(isChecked);
        };
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <Checkbox
                        id={this.id}
                        style={style}
                        label={this.label}
                        labelStyle={this.state.style}
                        checked={this.state.value}
                        onCheck={this.updateValue}
                    />
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}
