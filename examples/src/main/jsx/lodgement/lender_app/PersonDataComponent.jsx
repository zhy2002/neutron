import React from 'react';
import NeutronComponent from '../../materialui/NeutronComponent';
import PersonGeneralComponent from './PersonGeneralComponent';
import PersonContactComponent from './PersonContactComponent';
import PersonCurrentEmploymentComponent from './PersonCurrentEmploymentComponent';

export default class PersonDataComponent extends NeutronComponent {

    getTabClass(className, node) {
        if (this.model.getSelectedName() === node.getName()) {
            return `${className} is-active`;
        }
        return className;
    }

    selectTab(node) {
        this.model.setSelectedName(node.getName());
        console.log(`switched tab to:${node.getName()}`);
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
                        <li className={this.getTabClass('tabs-title', generalNode)}>
                            <a tabIndex="0" onClick={() => this.selectTab(generalNode)}>General</a>
                        </li>
                        <li className={this.getTabClass('tabs-title', contactNode)}>
                            <a tabIndex="0" onClick={() => this.selectTab(contactNode)}>Contact</a>
                        </li>
                        <li className={this.getTabClass('tabs-title', currentEmploymentNode)}>
                            <a tabIndex="0" onClick={() => this.selectTab(currentEmploymentNode)}>Current Employment</a>
                        </li>
                    </ul>
                </div>
                <div className="medium-10 columns">
                    <div>
                        <div className={this.getTabClass('hidden-panel', generalNode)}>
                            <PersonGeneralComponent model={generalNode}/>
                        </div>
                        <div className={this.getTabClass('hidden-panel', contactNode)}>
                            <PersonContactComponent model={contactNode}/>
                        </div>
                        <div className={this.getTabClass('hidden-panel', currentEmploymentNode)}>
                            <PersonCurrentEmploymentComponent model={currentEmploymentNode}/>
                        </div>
                    </div>
                </div>
            </div>
        );
    }

}
