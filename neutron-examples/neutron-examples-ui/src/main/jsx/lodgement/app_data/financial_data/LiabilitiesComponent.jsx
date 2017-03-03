import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import CreditCardListComponent from './CreditCardListComponent';
import LoanListComponent from './LoanListComponent';
import OtherLiabilityListComponent from './OtherLiabilityListComponent';

export default class LiabilityListComponent extends ListNeutronComponent {

    constructor(props) {
        super(props);

        this.state.test = false;
    }

    render() {
        const model = this.model;
        return (
            <div className="liability-list-component">
                <PanelComponent title="Liabilities">
                    <CreditCardListComponent model={model.getCreditCardListNode()}/>
                    <LoanListComponent model={model.getLoanListNode()}/>
                    <OtherLiabilityListComponent model={model.getOtherLiabilityListNode()}/>
                </PanelComponent>
            </div>
        );
    }
}
