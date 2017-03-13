import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextAreaComponent from '../../../bootstrap3/TextAreaComponent';
import MainContentComponent from '../common/MainContentComponent';

export default class AdditionalCommentComponent extends NeutronComponent {

    render() {
        return (
            <MainContentComponent className="additional-comment-component">
                <div className="row">
                    <div className="col-md-8">
                        <TextAreaComponent model={this.model} />
                    </div>
                </div>
            </MainContentComponent>
        );
    }
}
