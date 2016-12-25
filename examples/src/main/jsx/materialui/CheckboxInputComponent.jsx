import React from 'react';
import Checkbox from 'material-ui/Checkbox';

import InputComponent from './InputComponent.jsx';


let style = {
    marginTop: "30px"
};

export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();

        newState.label = this.label;
        newState.value = this.model.getValue();

        console.log("checkbox value:");
        console.log(newState.value);
        return newState;
    }

    render() {
        return (
            <div className="row material-field">
                <div className="medium-12 columns">
                    <Checkbox
                        style={style}
                        label={this.state.label}
                        checked={this.state.value}
                        onCheck={(event, isChecked) => {
                            this.model.setValue(isChecked);
                        }}
                    />
                </div>
            </div>
        );
    }

}