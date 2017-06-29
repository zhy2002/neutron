import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import ExistingMortgageList from './ExistingMortgageListComponent';

function UsageComponent(props) {
    const model = props.model;

    return (
        <MainContentComponent className={props.componentClass}>
            <div className="row">
                <div className="col-md-6">
                    <div className="row">
                        <div className="col-xs-8">
                            Used as security?
                        </div>
                        <div className="col-xs-4">
                            <RadioInputComponent
                                hideLabel
                                model={model.getUsedAsSecurityFlagNode()}
                            />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-xs-8">
                            Is this property being purchased?
                        </div>
                        <div className="col-xs-4">
                            <RadioInputComponent
                                hideLabel
                                model={model.getBeingPurchasedFlagNode()}
                            />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-xs-8">
                            Is the property owned outright?
                        </div>
                        <div className="col-xs-4">
                            <RadioInputComponent
                                hideLabel
                                model={model.getOwnedOutrightFlagNode()}
                            />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-xs-8">
                            Is this property the Primary Security?
                        </div>
                        <div className="col-xs-4">
                            <RadioInputComponent
                                hideLabel
                                model={model.getPrimarySecurityFlagNode()}
                            />
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-xs-8">
                            Approval In Principle?
                        </div>
                        <div className="col-xs-4">
                            <RadioInputComponent
                                hideLabel
                                model={model.getApprovalInPrincipleFlagNode()}
                            />
                        </div>
                    </div>
                </div>
                <div className="col-md-6">
                    <ExistingMortgageList model={model.getExistingMortgageListNode()}/>
                </div>
            </div>
        </MainContentComponent>
    );
}

export default NeutronHoc(UsageComponent);
