import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';

export default class FinancialSummaryComponent extends NeutronComponent {

    render() {
        const model = this.model;

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
}
