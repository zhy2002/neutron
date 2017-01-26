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
            <div className={super.renderContainerClass('checkbox checkbox-input-component')}>
                <label>
                    <input id={this.id} type="checkbox" onClick={this.updateValue} checked={this.state.value}/>
                    {this.label}
                </label>
            </div>
        );
    }

}
