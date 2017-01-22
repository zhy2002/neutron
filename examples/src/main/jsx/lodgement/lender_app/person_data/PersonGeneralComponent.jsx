import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';

export default class PersonGeneralComponent extends NeutronComponent {

    render() {
        const model = this.props.model;
        return (
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-9">
                        <div className="form-group form-group-sm">
                            <label htmlFor="exampleInputEmail1">Email address</label>
                            <input
                                type="email"
                                className="form-control input-sm"
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
                                className="form-control input-sm"
                                id="exampleInputEmail2"
                                placeholder="Email"
                            />
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
