import React from 'react';
import RemovePanelComponent from '../common/RemovePanelComponent';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';

export default class PersonSummaryComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.selectItem = () => {
            this.model.getContext().getRootNode().setContentNode(this.model);
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.name = this.model.getNodeLabel();
        return newState;
    }

    render() {
        return (
            <RemovePanelComponent className="person-summary-component" model={this.model}>
                <div className="row">
                    <div className="col-xs-12">
                        <a tabIndex="0" onClick={this.selectItem}>
                            {this.state.name}
                        </a>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }

}
