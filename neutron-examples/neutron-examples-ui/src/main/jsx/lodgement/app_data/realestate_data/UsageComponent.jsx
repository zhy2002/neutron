import React from 'react';
import MainContentComponent from '../common/MainContentComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import ExistingMortgageList from './ExistingMortgageListComponent';

export default class UsageComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <MainContentComponent className="usage-component">
                <div className="row">
                    <div className="col-md-6">
                        <div className="row">
                            <div className="col-xs-9">
                                Used as security?
                            </div>
                            <div className="col-xs-3">
                                <RadioInputComponent
                                    hideLabel
                                    model={model.getUsedAsSecurityFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-9">
                                Is this property being purchased?
                            </div>
                            <div className="col-xs-3">
                                <RadioInputComponent
                                    hideLabel
                                    model={model.getBeingPurchasedFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-9">
                                Is the property owned outright?
                            </div>
                            <div className="col-xs-3">
                                <RadioInputComponent
                                    hideLabel
                                    model={model.getOwnedOutrightFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-9">
                                Is this property the Primary Security?
                            </div>
                            <div className="col-xs-3">
                                <RadioInputComponent
                                    hideLabel
                                    model={model.getPrimarySecurityFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-9">
                                Approval In Principle?
                            </div>
                            <div className="col-xs-3">
                                <RadioInputComponent
                                    hideLabel
                                    model={model.getApprovalInPrincipleFlagNode()}
                                />
                            </div>
                        </div>
                    </div>
                    <div className="col-md-6">
                        <ExistingMortgageList model={model.getExistingMortgageListNode()} />
                    </div>
                </div>
            </MainContentComponent>
        );
    }
}
