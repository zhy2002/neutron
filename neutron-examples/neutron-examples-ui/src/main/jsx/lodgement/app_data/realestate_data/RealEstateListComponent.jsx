import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class RealEstateListComponent extends NeutronComponent {

    render() {
        return (
            <div className="real-estate-list-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
