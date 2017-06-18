import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RemovePanelComponent from '../common/RemovePanelComponent';
import BooleanLabelComponent from '../common/BooleanLabelComponent';
import NodeLabelComponent from '../../../bootstrap3/NodeLabelComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';


class CompanySummaryComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.selectItem = () => {
            const model = this.props.model;
            model.getContext().getRootNode().setContentNode(model);
        };
    }

    render() {
        const props = this.props;
        const model = props.model;
        const companyGeneralNode = model.getCompanyGeneralNode();

        return (
            <RemovePanelComponent className={props.componentClass} model={model}>
                <div className="row">
                    <div className="col-xs-12">
                        <div className="row company-name">
                            <div className="col-xs-12">
                                <a tabIndex="0" onClick={this.selectItem}>
                                    <NodeLabelComponent model={model}/>
                                </a>
                                <BooleanLabelComponent
                                    model={companyGeneralNode}
                                    trueLabel=" (Primary)"
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-xs-3">
                                <TextInputComponent model={companyGeneralNode.getCompanyAbnNode()} readonly/>
                            </div>
                            <div className="col-xs-3">
                                <TextInputComponent model={companyGeneralNode.getCompanyAcnNode()} readonly/>
                            </div>
                        </div>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }
}

export default NeutronHoc(CompanySummaryComponent);
