import React from 'react';
import InputComponent from './InputComponent';

export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            this.model.setValue(event.target.checked);
        };
    }

    render() {
        return (
            <div className={`checkbox checkbox-input-component${this.state.componentClass}`}>
                <label>
                    <input id={this.id} type="checkbox" onClick={this.updateValue} checked={this.state.value}/>
                    {this.label}
                </label>
            </div>
        );
    }

}
