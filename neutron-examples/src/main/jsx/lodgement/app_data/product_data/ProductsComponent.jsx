import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class ProductsComponent extends NeutronComponent {

    render() {
        return (
            <div className="products-component">
                <h3>{this.label}</h3>
            </div>
        );
    }
}
