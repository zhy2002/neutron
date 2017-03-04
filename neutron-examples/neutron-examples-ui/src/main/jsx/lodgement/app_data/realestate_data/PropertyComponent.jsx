import React from 'react';
import MainContentComponent from '../common/MainContentComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class PropertyComponent extends NeutronComponent {

    render() {
        return (
            <MainContentComponent className="property-component">
                <div className="row">
                    <div className="col-md-6">
                        {this.label}
                    </div>
                    <div className="col-md-6" />
                </div>
            </MainContentComponent>
        );
    }
}
