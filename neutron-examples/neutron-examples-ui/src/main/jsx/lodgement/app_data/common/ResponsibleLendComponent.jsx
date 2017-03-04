import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import MainContentComponent from './MainContentComponent';

const significantChangeLabel = 'Are you aware of any significant changes in circumstances'
    + ' that will adversely affect your ability to make contracted loan repayments?';
const changeTypeLabel = 'What kind of significant changes are you expecting?';
const mitigationLabel = 'Mitigant/How will you continue to make repayments?';
const repaymentDifficultLabel = 'Have you had any difficulty in meeting '
    + 'your existing loan commitments in the past 2 years?';

export default class ResponsibleLendComponent extends NeutronComponent {

    render() {
        const model = this.model;
        return (
            <MainContentComponent className="responsible-lend-component">
                <div className="row">
                    <div className="col-md-4">
                        <RadioInputComponent
                            label={significantChangeLabel}
                            model={model.getResponsibleSignificantChangeFlagNode()}
                        />
                    </div>
                    <div className="col-md-4">
                        <SelectInputComponent
                            label={changeTypeLabel}
                            model={model.getResponsibleTypeOfChangeNode()}
                        />
                    </div>
                    <div className="col-md-4">
                        <SelectInputComponent
                            label={mitigationLabel}
                            model={model.getResponsibleMitigationMethodNode()}
                        />
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <RadioInputComponent
                            label={repaymentDifficultLabel}
                            model={model.getResponsibleRepaymentDifficultyNode()}
                        />
                    </div>
                    <div className="col-md-8"/>
                </div>
            </MainContentComponent>
        );
    }
}
