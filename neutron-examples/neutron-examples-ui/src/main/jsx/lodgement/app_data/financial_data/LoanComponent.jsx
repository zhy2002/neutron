import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class LoanComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.test = true;
    }

    render() {
        return (
            <div className="loan-component">LoanComponent</div>
        );
    }
}
