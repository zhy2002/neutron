import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';

export default class PersonGeneralComponent extends NeutronComponent {

    render() {
        const model = this.props.model;
        return (
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-3">
                        <RadioInputComponent model={model.getApplicantTypeNode()}/>
                    </div>
                    <div className="col-md-3">
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
                    <div className="col-md-3"/>
                </div>
            </div>
        );
    }
}
