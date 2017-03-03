import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class RelatedPartyComponent extends NeutronComponent {

    render() {
        return (
            <div className="related-party-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
