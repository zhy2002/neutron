import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';

export default class PersonGeneralComponent extends NeutronComponent {

    render() {
        const model = this.props.model;
        return (
            <div className="container-fluid small">
                <div className="row">
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-9">
                        <div className="form-group form-group-sm">
                            <label htmlFor="exampleInputEmail1">Email address</label>
                            <input
                                type="email"
                                className="form-control"
                                id="exampleInputEmail1"
                                placeholder="Email"
                            />
                        </div>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                    </div>
                    <div className="col-md-9">
                        <div className="form-group form-group-sm">
                            <label htmlFor="exampleInputEmail2">Email address</label>
                            <input
                                type="email"
                                className="form-control"
                                id="exampleInputEmail2"
                                placeholder="Email"
                            />
                        </div>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-1 compact">
                        <SelectInputComponent model={model.getTitleNode()}/>
                    </div>
                    <div className="col-md-1 compact">
                        <TextInputComponent model={model.getFirstNameNode()}/>
                    </div>
                    <div className="col-md-1 compact">
                        <TextInputComponent model={model.getLastNameNode()}/>
                    </div>
                    <div className="col-md-9">
                        <div className="form-group form-group-sm">
                            <label htmlFor="exampleInputEmail3">Email address</label>
                            <input
                                type="email"
                                className="form-control input-sm"
                                id="exampleInputEmail3"
                                placeholder="Email"
                            />
                        </div>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-2 compact">
                        <DateInputComponent model={model.getDateOfBirthNode()}/>
                    </div>
                    <div className="col-md-2 compact">
                        <RadioInputComponent model={model.getGenderNode()}/>
                    </div>
                    <div className="col-md-8"/>
                </div>
                <div className="row">
                    <div className="col-md-3">
                        <TextInputComponent model={model.getDriversLicenseNode()}/>
                    </div>
                    <div className="col-md-9"/>
                </div>
            </div>
        );
    }
}
