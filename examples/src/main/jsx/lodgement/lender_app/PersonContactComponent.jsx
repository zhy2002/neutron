import React from 'react';
import Paper from 'material-ui/Paper';
import NeutronComponent from '../../materialui/NeutronComponent';
import TelephoneComponent from './TelephoneComponent';
import AddressComponent from './AddressComponent';
import TextInputComponent from '../../materialui/TextInputComponent';
import MonthYearComponent from './MonthYearComponent';

const paperMargin = {
    margin: '10px 2px',
    paddingTop: '0.5em'
};

export default class PersonContactComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        const model = this.model;

        return (
            <div className="row expanded">
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <TelephoneComponent model={model.getHomePhoneNode()}/>
                        <TelephoneComponent model={model.getWorkPhoneNode()}/>
                        <TextInputComponent model={model.getContactEmailNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <AddressComponent model={model.getCurrentAddressNode()}/>
                        <MonthYearComponent model={model.getMovedToCurrentAddressNode()}/>
                        <AddressComponent model={model.getPostalAddressNode()}/>
                    </Paper>
                </div>
                <div className="large-4 medium-6 columns">
                    <Paper style={paperMargin}>
                        <AddressComponent model={model.getPreviousAddressNode()}/>
                        <MonthYearComponent model={model.getMovedToPreviousAddressNode()}/>
                        <MonthYearComponent model={model.getMovedFromPreviousAddressNode()}/>
                    </Paper>

                </div>
            </div>
        );
    }

}
