import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import TelephoneComponent from '../common/TelephoneComponent';
import AddressComponent from '../common/AddressComponent';
import MainContentComponent from '../common/MainContentComponent';

class SubmissionComponent extends React.PureComponent {

    render() {
        const model = this.props.model;
        return (
            <MainContentComponent className={this.props.componentClass}>
                <div className="row">
                    <div className="col-md-4 col-sm-6">
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getBrokerFirstNameNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getBrokerLastNameNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getBrokerCompanyNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getLenderIssuedBrokerNumberNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-4 col-sm-6">
                        <div className="row">
                            <div className="col-xs-12">
                                <TelephoneComponent model={model.getContactNumberNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TelephoneComponent model={model.getFaxNumberNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getMobileNumberNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <TextInputComponent model={model.getBrokerEmailNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-4 col-sm-6">
                        <div className="row">
                            <div className="col-xs-12">
                                <AddressComponent model={model.getBrokerAddressNode()}/>
                            </div>
                        </div>
                    </div>
                </div>
            </MainContentComponent>
        );
    }
}

export default NeutronHoc(
    SubmissionComponent
);
