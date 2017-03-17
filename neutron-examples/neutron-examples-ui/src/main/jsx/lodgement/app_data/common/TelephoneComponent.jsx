import React from 'react';
import InputComponent from '../../../bootstrap3/InputComponent';

export default class TelephoneComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateCountryCode = (event) => {
            const value = event.target.value;
            const telephone = this.model.getCopyOfValue();
            telephone.setCountryCode(value);
            this.model.setValue(telephone);
        };

        this.updateAreaCode = (event) => {
            const value = event.target.value;
            const telephone = this.model.getCopyOfValue();
            telephone.setAreaCode(value);
            this.model.setValue(telephone);
        };

        this.updatePhoneNumber = (event) => {
            const value = event.target.value;
            const telephone = this.model.getCopyOfValue();
            telephone.setPhoneNumber(value);
            this.model.setValue(telephone);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.countryCode = '';
        newState.areaCode = '';
        newState.phoneNumber = '';

        const telephone = this.model.getValue();
        if (telephone) {
            if (telephone.getCountryCode()) {
                newState.countryCode = telephone.getCountryCode();
            }
            if (telephone.getAreaCode()) {
                newState.areaCode = telephone.getAreaCode();
            }
            if (telephone.getPhoneNumber()) {
                newState.phoneNumber = telephone.getPhoneNumber();
            }
        }

        newState.countryCodeReadonly = this.model.getCountryCodeReadonly();

        return newState;
    }

    render() {
        const model = this.model;
        const countryInputId = `${model.getUniqueId()}-country`;

        return (
            <div
                id={model.getUniqueId()}
                tabIndex="0"
                className={`form-group form-group-sm telephone-component${this.state.componentClass}`}
            >
                <label htmlFor={countryInputId}>{this.label}</label>
                <div className="clearfix">
                    <input
                        id={countryInputId}
                        type="text"
                        className="form-control country-code"
                        placeholder="Country Code"
                        value={this.state.countryCode}
                        onChange={this.updateCountryCode}
                        readOnly={this.state.countryCodeReadonly}
                    />
                    <input
                        type="text"
                        className="form-control area-code"
                        placeholder="Area Code"
                        value={this.state.areaCode}
                        onChange={this.updateAreaCode}
                    />
                    <input
                        type="text"
                        className="form-control phone-number"
                        placeholder="Phone Number"
                        value={this.state.phoneNumber}
                        onChange={this.updatePhoneNumber}
                    />
                </div>
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }

}

TelephoneComponent.propTypes = {
    label: React.PropTypes.string
};
