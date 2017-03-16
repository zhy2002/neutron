import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';

export default class ProductFeatureComponent extends ListNeutronComponent {

    render() {
        return (
            <div>{this.label}</div>
        );
    }
}
