import React from 'react';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import PersonGeneralComponent from "./PersonGeneralComponent.jsx";
import PersonContactComponent from "./PersonContactComponent.jsx";
import PersonCurrentEmploymentComponent from "./PersonCurrentEmploymentComponent.jsx";

export default class PersonDataComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    getTabClass(className, node) {
        if (this.model.getSelectedName() == node.getName()) {
            className += ' is-active';
        }
        return className;
    }

    selectTab(node) {

        this.model.setSelectedName(node.getName());
        console.log('switched tab to:' + node.getName());
        return false;
    }

    render() {
        const model = this.model;
        const generalNode = model.getGeneralNode();
        const contactNode = model.getContactNode();
        const currentEmploymentNode = model.getCurrentEmploymentNode();

        return (
            <div className="expanded row collapse">
                <div className="medium-2 columns">
                    <ul className="tabs vertical">
                        <li className={this.getTabClass("tabs-title", generalNode)}><a href="javascript:void(0)"
                                                                                       onClick={() => this.selectTab(generalNode)}>General</a>
                        </li>
                        <li className={this.getTabClass("tabs-title", contactNode)}><a href="javascript:void(0)"
                                                                                       onClick={() => this.selectTab(contactNode)}>Contact</a>
                        </li>
                        <li className={this.getTabClass("tabs-title", currentEmploymentNode)}><a
                            href="javascript:void(0)" onClick={() => this.selectTab(currentEmploymentNode)}>Current
                            Employment</a></li>
                    </ul>
                </div>
                <div className="medium-10 columns">
                    <div>
                        <div className={this.getTabClass("hidden-panel", generalNode)}>
                            <PersonGeneralComponent model={generalNode}/>
                        </div>
                        <div className={this.getTabClass("hidden-panel", contactNode)}>
                            <PersonContactComponent model={contactNode}/>
                        </div>
                        <div className={this.getTabClass("hidden-panel", currentEmploymentNode)}>
                            <PersonCurrentEmploymentComponent model={currentEmploymentNode}/>
                        </div>
                    </div>
                </div>
            </div>
        );
    }

}