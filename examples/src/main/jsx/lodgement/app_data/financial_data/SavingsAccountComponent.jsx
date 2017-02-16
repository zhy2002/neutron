import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';

export default class SavingsAccountComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.delete = () => {
            if (window.confirm(`Are you sure you want to remove this ${this.model.getNodeLabel()}`)) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    render() {
        const model = this.model;
        return (
            <div className="well savings-account-component">
                <div className="row">
                    <div className="col-md-7">
                        <div className="row">
                            <div className="col-md-4">
                                <SelectInputComponent model={model.getSavingsTypeNode()}/>
                            </div>
                            <div className="col-md-4">
                                <TextInputComponent model={model.getSavingsInstitutionNameNode()}/>
                            </div>
                            <div className="col-md-4">
                                <NumberInputComponent model={model.getSavingsBalanceNode()}/>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-md-4">
                                <TextInputComponent model={model.getSavingsBsbNoNode()}/>
                            </div>
                            <div className="col-md-4">
                                <TextInputComponent model={model.getSavingsAccountNoNode()}/>
                            </div>
                            <div className="col-md-4">
                                <TextInputComponent model={model.getSavingsAccountNameNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-5">
                        Ownership (todo) close button (todo)
                        <a tabIndex="0" className="close-link" onClick={this.delete}>
                            <span className="glyphicon glyphicon-remove-circle"/>
                        </a>
                    </div>
                </div>
            </div>
        );
    }
}
