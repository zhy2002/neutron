import React from 'react';
import {red500} from 'material-ui/styles/colors';
import InputComponent from '../../materialui/InputComponent';
import FieldErrorMessageComponent from '../../materialui/FieldErrorMessageComponent';


const columnStyle = {
    paddingLeft: '2px',
    paddingRight: '2px'
};


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

        if (newState.errorMessage) {
            newState.style.color = red500;
        }

        return newState;
    }

    render() {
        const model = this.model;

        console.log('telephone style is:');
        console.log(this.state.style);

        return (
            <div
                id={model.getUniqueId()}
                tabIndex="0"
                className="row expanded telephone"
                style={{marginBottom: '16px'}}
            >
                <div className="small-12 columns">
                    <p style={this.state.style}>{this.label}</p>
                    <div className="row expanded">
                        <div className="small-2 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Country Code"
                                value={this.state.countryCode}
                                onChange={this.updateCountryCode}
                                style={this.state.style}
                            />
                        </div>
                        <div className="small-2 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Area Code"
                                value={this.state.areaCode}
                                onChange={this.updateAreaCode}
                                style={this.state.style}
                            />
                        </div>
                        <div className="small-8 columns" style={columnStyle}>
                            <input
                                type="text" placeholder="Phone Number"
                                value={this.state.phoneNumber}
                                onChange={this.updatePhoneNumber}
                                style={this.state.style}
                            />
                        </div>
                    </div>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                </div>
            </div>
        );
    }

}

//todo static
TelephoneComponent.propTypes = {
    label: React.PropTypes.string
};
