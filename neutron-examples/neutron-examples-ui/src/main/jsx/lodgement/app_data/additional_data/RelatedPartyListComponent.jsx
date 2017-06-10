import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import RelatedPartySummaryComponent from './RelatedPartySummaryComponent';


class RelatedPartyListComponent extends React.PureComponent {

    render() {
        const model = this.props.model;
        return (
            <div className={this.props.componentClass}>
                <AddListComponent model={model}>
                    {
                        model.getChildren().map(
                            item => <RelatedPartySummaryComponent key={item.getUniqueId()} model={item}/>
                        )
                    }
                </AddListComponent>
            </div>
        );
    }
}

RelatedPartyListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();

export default NeutronHoc(RelatedPartyListComponent);
