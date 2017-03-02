import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CreditHistoryListComponent from './CreditHistoryListComponent';

export default class PrivacyComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="container-fluid compact privacy-component">
                <div className="row">
                    <div className="col-md-4">
                        <div className="row">
                            <div className="col-xs-12">
                                <CheckboxInputComponent
                                    label="Allow Credit Check"
                                    model={model.getCreditCheckFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <CheckboxInputComponent
                                    label="Allow Third Party Disclosure"
                                    model={model.getThirdPartyDisclosureFlagNode()}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-12">
                                <br/>
                                <p>
                                    Has legal action been instituted against you or the co-applicant for default
                                    under any credit under any credit contract within the last 5 years?
                                    <br/>
                                    or<br/>
                                    Have you, or the co-applicant ever had a judgement entered against you,
                                    been backrupt, insolvent, assigned your estate for the benefit of creditors
                                    or entered into a scheme of arrangement with your creditors?
                                </p>
                                <RadioInputComponent hideLabel model={model.getLegalActionNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-8">
                        <div className="row">
                            <div className="col-xs-12">
                                <CreditHistoryListComponent model={model.getCreditHistoryListNode()} />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
