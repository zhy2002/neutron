import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';


export default class ProductCustomerContributionEditorComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div className="row">
                <div className="col-sm-12">
                    <div className="row">
                        <div className="col-sm-12">
                            <SelectInputComponent model={model.getContributionTypeNode()}/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-sm-12">
                            <TextInputComponent model={model.getContributionDescriptionNode()}/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-sm-12">
                            <NumberInputComponent model={model.getContributionAmountNode()}/>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
