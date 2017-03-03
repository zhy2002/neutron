import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PrivacyComponent from '../common/PrivacyComponent';

export default class PersonPrivacyComponent extends NeutronComponent {

    render() {
        return (
            <div className="person-privacy-component">
                <PrivacyComponent model={this.model}/>
            </div>
        );
    }
}
