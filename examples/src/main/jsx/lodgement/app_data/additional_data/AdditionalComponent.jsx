import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class AdditionalComponent extends NeutronComponent {

    render() {
        return (
            <div className="additional-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
