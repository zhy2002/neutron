import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import CreditCardListComponent from './CreditCardListComponent';
import LoanListComponent from './LoanListComponent';
import OtherLiabilityListComponent from './OtherLiabilityListComponent';

function LiabilityListComponent(props) {
    const model = props.model;
    return (
        <div className="liability-list-component">
            <PanelComponent title="Liabilities" className="panel-primary" expandable>
                <CreditCardListComponent model={model.getCreditCardListNode()}/>
                <LoanListComponent model={model.getLoanListNode()}/>
                <OtherLiabilityListComponent model={model.getOtherLiabilityListNode()}/>
            </PanelComponent>
        </div>
    );
}

export default NeutronHoc(LiabilityListComponent);
