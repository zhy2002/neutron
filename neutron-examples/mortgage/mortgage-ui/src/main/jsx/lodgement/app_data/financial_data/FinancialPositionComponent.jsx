import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import FinancialSummaryComponent from './FinancialSummaryComponent';
import AssetsComponent from './AssetsComponent';
import LiabilitiesComponent from './LiabilitiesComponent';
import ExpenseListComponent from './ExpenseListComponent';


function FinancialPositionComponent(props) {
    const model = props.model;
    return (
        <div className={props.componentClass}>
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

export default NeutronHoc(FinancialPositionComponent);
