import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import FinancialSummaryComponent from './FinancialSummaryComponent';
import AssetsComponent from './AssetsComponent';
import LiabilitiesComponent from './LiabilitiesComponent';
import ExpenseListComponent from './ExpenseListComponent';


export default class FinancialPositionComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <div className="financial-position-component">
                <div className="container-fluid ">
                    <div className="row">
                        <div className="col-md-12">
                            <FinancialSummaryComponent model={model}/>
                            <AssetsComponent model={model.getAssetsNode()}/>
                            <LiabilitiesComponent model={model.getLiabilitiesNode()}/>
                            <ExpenseListComponent model={model.getExpenseListNode()}/>
                        </div>
                    </div>

                </div>
            </div>
        );
    }
}
