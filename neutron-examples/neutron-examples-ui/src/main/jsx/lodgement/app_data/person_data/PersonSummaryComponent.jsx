import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RemovePanelComponent from '../common/RemovePanelComponent';
import BooleanLabelComponent from '../common/BooleanLabelComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';


class PersonSummaryComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.selectItem = () => {
            const model = this.props.model;
            model.getContext().getRootNode().setContentNode(model);
        };
    }

    render() {
        const model = this.props.model;
        const personGeneralNode = model.getPersonGeneralNode();

        return (
            <RemovePanelComponent className="person-summary-component" model={model}>
                <div className="row">
                    <div className="col-xs-12">
                        <div className="row person-name">
                            <div className="col-xs-12">
                                <a tabIndex="0" onClick={this.selectItem}>
                                    <NodeLabelComponent model={model.getPersonGeneralNode()}/>
                                </a>
                                <BooleanLabelComponent
                                    model={personGeneralNode.getPrimaryApplicantFlagNode()}
                                    trueLabel=" (Primary)"
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-3">
                                <SelectInputComponent model={personGeneralNode.getApplicationTypeNode()} readonly/>
                            </div>
                            <div className="col-xs-3">
                                <SelectInputComponent model={personGeneralNode.getMaritalStatusNode()} readonly/>
                            </div>
                        </div>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }
}

export default NeutronHoc(PersonSummaryComponent);
