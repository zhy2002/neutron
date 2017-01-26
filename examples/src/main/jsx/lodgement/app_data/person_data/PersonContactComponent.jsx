import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TelephoneComponent from '../common/TelephoneComponent';
// import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
// import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
// import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
// import TextInputComponent from '../../../bootstrap3/TextInputComponent';
// import DateInputComponent from '../../../bootstrap3/DateInputComponent';

export default class PersonContactComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact">
                <div className="row">
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getHomePhoneNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getWorkPhoneNode()}/>
                    </div>
                    <div className="col-md-4">
                        <TelephoneComponent model={model.getFaxNumberNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-12">
                        Remaining data...
                    </div>
                </div>
            </div>
        );
    }
}
