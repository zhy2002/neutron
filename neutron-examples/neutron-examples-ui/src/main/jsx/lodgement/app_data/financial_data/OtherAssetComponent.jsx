import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class OtherAssetComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.test = true;
    }

    render() {
        return (
            <div className="other-asset-component">OtherAssetComponent</div>
        );
    }
}
