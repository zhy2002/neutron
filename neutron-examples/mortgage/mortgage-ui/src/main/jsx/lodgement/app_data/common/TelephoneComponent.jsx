import React from 'react';
import PropTypes from 'prop-types';
import debounce from 'throttle-debounce/debounce';
import InputComponent from '../../../bootstrap3/InputComponent';

export default class TelephoneComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.updateCountryCode = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            const value = event.target.value;
            const telephone = this.model.getValue();
            telephone.countryCode = value;
            this.model.setValue(telephone);
            context.debouncedExitDebouncingMode();
        };

        this.updateAreaCode = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            const value = event.target.value;
            const telephone = this.model.getValue();
            telephone.areaCode = value;
            this.model.setValue(telephone);
            context.debouncedExitDebouncingMode();
        };

        //todo fix
        this.updatePhoneNumber = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            const value = event.target.value;
            const telephone = this.model.getValue();
            telephone.phoneNumber = value;
            this.model.setValue(telephone);
            context.debouncedExitDebouncingMode();
        };

        this.resetTelephone = () => {
            this.props.model.resetValue();
        };

        const suppressIncompleteValidation = debounce(
            250,
            false,
            (val) => {
                this.model.setSuppressTelephoneCompleteRule(val);
            }
        );

        this.handleFocus = () => {
            suppressIncompleteValidation(true);
        };

        this.handleBlur = () => {
            suppressIncompleteValidation(false);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.countryCode = '';
        newState.areaCode = '';
        newState.phoneNumber = '';

        const telephone = this.model.getValue();
        if (telephone) {
            if (telephone.countryCode) {
                newState.countryCode = telephone.countryCode;
            }
            if (telephone.areaCode) {
                newState.areaCode = telephone.areaCode;
            }
            if (telephone.phoneNumber) {
                newState.phoneNumber = telephone.phoneNumber;
            }
        }

        newState.countryCodeReadonly = this.model.getCountryCodeReadonly();

        return newState;
    }

    renderLabel() {
        const {readonly, disabled} = this.props;
        return (
            <button className="link" onClick={this.resetTelephone} disabled={readonly || disabled}>
                <span className="glyphicon glyphicon-erase"/>
            </button>
        );
    }

    renderContent() {
        const model = this.model;
        const countryInputId = `${model.getUniqueId()}-country`;
        const areaInputId = `${model.getUniqueId()}-area`;
        const conditionalAreaProps = {};
        if (this.state.countryCode === '+61') {
            conditionalAreaProps.list = `${areaInputId}-list`;
        }
        return (
            <div
                className="telephone-container clearfix"
                id={model.getUniqueId()}
                tabIndex="0"
                onFocus={this.handleFocus}
                onBlur={this.handleBlur}
            >
                <input
                    id={countryInputId}
                    type="text"
                    className="form-control country-code"
                    placeholder="Country"
                    value={this.state.countryCode}
                    onChange={this.updateCountryCode}
                    readOnly={this.state.countryCodeReadonly}
                    list={`${countryInputId}-list`}
                />
                <datalist id={`${countryInputId}-list`}>
                    <option value="+61"/>
                    <option value="+1"/>
                    <option value="+44"/>
                    <option value="+64"/>
                    <option value="+86"/>
                </datalist>
                <input
                    id={areaInputId}
                    type="text"
                    className="form-control area-code"
                    placeholder="Area"
                    value={this.state.areaCode}
                    onChange={this.updateAreaCode}
                    {...conditionalAreaProps}
                />
                {
                    this.state.countryCode === '+61' &&
                    <datalist id={`${areaInputId}-list`}>
                        <option value="02"/>
                        <option value="03"/>
                        <option value="04"/>
                        <option value="07"/>
                        <option value="08"/>
                    </datalist>
                }
                <input
                    type="text"
                    className="form-control phone-number"
                    placeholder="Phone Number"
                    value={this.state.phoneNumber}
                    onChange={this.updatePhoneNumber}
                />
            </div>
        );
    }
}

TelephoneComponent.propTypes = {
    label: PropTypes.string
};
