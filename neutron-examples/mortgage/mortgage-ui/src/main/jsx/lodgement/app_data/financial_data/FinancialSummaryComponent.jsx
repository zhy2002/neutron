import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';

function FinancialSummaryComponent(props) {
    const model = props.model;

    return (
        <div className="financial-summary-component">
            <PanelComponent title="Summary" className="panel-primary">
                <div className="row">
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getTotalAssetNode()} readonly/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getTotalLiabilityNode()} readonly/>
                    </div>
                    <div className="col-md-3">
                        <NumberInputComponent model={model.getTotalExpenseNode()} readonly/>
                    </div>
                    <div className="col-md-3"/>
                </div>
            </PanelComponent>
        </div>
    );
}

export default NeutronHoc(FinancialSummaryComponent);
