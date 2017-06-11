import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextAreaComponent from '../../../bootstrap3/TextAreaComponent';
import MainContentComponent from '../common/MainContentComponent';

function AdditionalCommentComponent(props) {
    return (
        <MainContentComponent className="additional-comment-component">
            <div className="row">
                <div className="col-md-8">
                    <TextAreaComponent model={props.model}/>
                </div>
            </div>
        </MainContentComponent>
    );
}

AdditionalCommentComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(AdditionalCommentComponent);
