import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RemovePanelComponent from '../common/RemovePanelComponent';

function RelatedPartySummaryComponent(props) {
    function selectItem() {
        const model = props.model;
        model.getContext().getRootNode().setContentNode(model);
    }

    return (
        <RemovePanelComponent
            className={props.componentClass}
            model={props.model}
        >
            <div className="row">
                <div className="col-xs-12">
                    <a tabIndex="0" onClick={selectItem}>
                        {props.label}
                    </a>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(
    RelatedPartySummaryComponent
);
