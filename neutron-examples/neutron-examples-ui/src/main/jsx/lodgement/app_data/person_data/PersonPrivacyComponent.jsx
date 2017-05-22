import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PrivacyComponent from '../common/PrivacyComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class PersonPrivacyComponent extends NeutronComponent {

    render() {
        return (
            <MainContentComponent className="person-privacy-component">
                <PrivacyComponent model={this.model}/>
            </MainContentComponent>
        );
    }
}
