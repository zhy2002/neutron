import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RemovePanelComponent from '../../../bootstrap3/RemovePanelComponent';
import NodeLabelComponent from '../../../neutron/NodeLabelComponent';

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
                        <NodeLabelComponent model={props.model}/>
                    </a>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(
    RelatedPartySummaryComponent
);
