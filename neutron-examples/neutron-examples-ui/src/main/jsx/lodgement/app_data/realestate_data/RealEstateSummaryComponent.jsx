import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RemovePanelComponent from '../common/RemovePanelComponent';

const OtherRealEstateDetailsComponent = NeutronHoc(
    (props) => {
        const model = props.model;
        const propertyNode = model.getParent().getPropertyNode();

        return (
            <div className="row">
                <div className="col-md-3">
                    <RadioInputComponent
                        model={model.getUsedAsSecurityFlagNode()}
                        readonly
                    />
                </div>
                <div className="col-md-3">
                    <RadioInputComponent
                        model={model.getOwnedOutrightFlagNode()}
                        readonly
                    />
                </div>
                {propertyNode &&
                <div className="col-md-3">
                    <RadioInputComponent
                        model={propertyNode.getPropertyPurseNode()}
                        readonly
                    />
                </div>
                }
                {propertyNode &&
                <div className="col-md-3">
                    <NumberInputComponent
                        model={propertyNode.getEstimatedMarketValueNode()}
                        readonly
                    />
                </div>
                }
            </div>
        );
    }
);

function RealEstateSummaryComponent(props) {
    const model = props.model;

    function selectItem() {
        model.getContext().getRootNode().setContentNode(model);
    }

    return (
        <RemovePanelComponent className={props.componentClass} model={model}>
            <div className="row">
                <div className="col-xs-12">
                    <a tabIndex="0" onClick={selectItem}>
                        {props.name}
                    </a>
                </div>
            </div>
            <OtherRealEstateDetailsComponent model={model.getUsageNode()}/>
        </RemovePanelComponent>
    );
}

RealEstateSummaryComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(
    RealEstateSummaryComponent,
    (model) => {
        const props = {};
        props.name = model.getNodeLabel();
        return props;
    }
);
