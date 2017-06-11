import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import RelatedPartySummaryComponent from './RelatedPartySummaryComponent';


function RelatedPartyListComponent(props) {
    const model = props.model;
    return (
        <div className={props.componentClass}>
            <AddListComponent
                model={model}
                emptyMessage="No related party in this application."
            >
                {
                    model.getChildren().map(
                        item => <RelatedPartySummaryComponent key={item.getUniqueId()} model={item}/>
                    )
                }
            </AddListComponent>
        </div>
    );
}

RelatedPartyListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(RelatedPartyListComponent);
