import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class ProductComponent extends NeutronComponent {

    render() {
        return (
            <div className="product-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
