import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import FinancialItemComponent from './FinancialItemComponent';


class CreditCardComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.delete = () => {
            const model = this.props.model;

            if (window.confirm(`Are you sure you want to remove this ${model.getNodeLabel()}`)) {
                model.getParent().removeItem(model);
            }
        };
    }

    render() {
        const model = this.props.model;

        return (
            <FinancialItemComponent model={model} className={this.props.componentClass}>
                <div className="row">
                    <div className="col-md-4">
                        <SelectInputComponent model={model.getCreditCardTypeNode()}/>
                    </div>
                    <div className="col-md-8">
                        <TextInputComponent model={model.getCreditCardLenderNameNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardLimitAmountNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardAmountOwingNode()}/>
                    </div>
                    <div className="col-md-4">
                        <NumberInputComponent model={model.getCreditCardMonthlyRepaymentNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-4">
                        <CheckboxInputComponent model={model.getCreditCardClearingFlagNode()}/>
                    </div>
                    <div className="col-md-8">
                        <NumberInputComponent model={model.getCreditCardBreakCostNode()}/>
                    </div>
                </div>
            </FinancialItemComponent>
        );
    }
}

export default NeutronHoc(CreditCardComponent);
