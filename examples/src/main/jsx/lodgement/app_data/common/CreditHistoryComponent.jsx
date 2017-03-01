import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';


export default class CreditHistoryComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            if (window.confirm('Are you sure you want to delete this employment record?')) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    render() {
        const model = this.model;

        return (
            <div className="row">
                <div className="col-xs-4 col-xs-offset-2">
                    <p><em>Legal Issue</em></p>
                    <TextInputComponent model={model} hideLabel label=" "/>
                </div>
                <div className="col-xs-6">
                    <button className="btn btn-sm btn-warning" onClick={this.removeItem}>
                        Remove
                    </button>
                </div>
            </div>
        );
    }
}
