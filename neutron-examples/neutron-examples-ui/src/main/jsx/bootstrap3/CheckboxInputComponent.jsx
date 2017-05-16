import React from 'react';
import InputComponent from './InputComponent';
import ErrorMessageComponent from './ErrorMessageComponent';


export default class CheckboxInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateValue = (event) => {
            console.log(event.target.checked);
            this.model.setValue(event.target.checked);
        };
    }

    render() {
        return (
            <div className={super.renderContainerClass('checkbox checkbox-input-component')}>
                <label className="layout-helper">&nbsp;</label>
                <label className="checkbox-container">
                    <input
                        id={this.id}
                        type="checkbox"
                        onChange={this.updateValue}
                        checked={this.state.value}
                        disabled={this.state.disabled}
                    />
                    {!this.props.hideLabel &&
                        this.state.label
                    }
                </label>
                <ErrorMessageComponent message={this.state.errorMessage} />
            </div>
        );
    }

}
