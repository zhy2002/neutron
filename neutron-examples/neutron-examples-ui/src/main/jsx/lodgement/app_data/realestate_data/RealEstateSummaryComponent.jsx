import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import NumberInputComponent from '../../../bootstrap3/NumberInputComponent';
import RemovePanelComponent from '../../../bootstrap3/RemovePanelComponent';

const OtherRealEstateDetailsComponent = NeutronHoc(
    (props) => {
        const model = props.model;


        return (
            <div className={`${props.componentClass} row`}>
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
                <div className="col-md-3">
                    <RadioInputComponent
                        model={props.propertyPurposeNode}
                        readonly
                    />
                </div>
                <div className="col-md-3">
                    <NumberInputComponent
                        model={props.marketValueNode}
                        readonly
                    />
                </div>
            </div>
        );
    }
);

function RealEstateSummaryComponent(props) {
    const model = props.model;
    const propertyNode = model.getPropertyNode();

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
            <OtherRealEstateDetailsComponent
                model={model.getUsageNode()}
                propertyPurposeNode={propertyNode.getPropertyPurseNode()}
                marketValueNode={propertyNode.getEstimatedMarketValueNode()}
            />
        </RemovePanelComponent>
    );
}

export default NeutronHoc(
    RealEstateSummaryComponent,
    (model) => {
        const props = {};
        props.name = model.getNodeLabel();
        return props;
    }
);
