import React from 'react';

import ApplicationToolbarComponent from './ApplicationToolbarComponent.jsx';
import ApplicationDataComponent from './ApplicationDataComponent.jsx';
import NeutronComponent from '../../materialui/NeutronComponent.jsx';


export default class LenderApplicationComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;

        return (
            <div>
                <ApplicationToolbarComponent/>
                <ApplicationDataComponent model={model} />
            </div>
        );
    }
}