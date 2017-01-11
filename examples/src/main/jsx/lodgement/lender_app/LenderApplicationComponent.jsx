import React from 'react';
import ApplicationToolbarComponent from './ApplicationToolbarComponent';
import ApplicationDataComponent from './ApplicationDataComponent';
import NeutronComponent from '../../materialui/NeutronComponent';
import ValidationErrorsComponent from '../ValidationErrorsComponent';


export default class LenderApplicationComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div>
                <ApplicationToolbarComponent model={model}/>
                <ApplicationDataComponent model={model}/>
                <ValidationErrorsComponent model={model}/>
            </div>
        );
    }
}
