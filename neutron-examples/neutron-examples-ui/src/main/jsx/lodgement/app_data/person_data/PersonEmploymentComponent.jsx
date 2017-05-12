import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import PersonEmployedComponent from './PersonEmployedComponent';
import PersonRetiredComponent from './PersonRetiredComponent';
import PersonUnemployedComponent from './PersonUnemployedComponent';
import RemovePanelComponent from '../common/RemovePanelComponent';


export default class PersonEmploymentComponent extends NeutronComponent {

    extractNewState() {
        const newState = super.extractNewState();
        newState.selectedName = this.model.getSelectedName();
        return newState;
    }

    render() {
        const model = this.model;
        return (
            <RemovePanelComponent className="person-employment-component" model={model}>
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-12">
                            <RadioInputComponent model={model.getEmploymentTypeNode()}/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-12 employment-section">
                            {this.state.selectedName === 'payeEmployedNode' &&
                            <PersonEmployedComponent model={model.getPayeEmployedNode()}/>
                            }
                            {this.state.selectedName === 'selfEmployedNode' &&
                            <PersonEmployedComponent model={model.getSelfEmployedNode()}/>
                            }
                            {this.state.selectedName === 'retiredEmploymentNode' &&
                            <PersonRetiredComponent model={model.getRetiredEmploymentNode()}/>
                            }
                            {this.state.selectedName === 'unemployedNode' &&
                            <PersonUnemployedComponent model={model.getUnemployedNode()}/>
                            }
                        </div>
                    </div>
                </div>
            </RemovePanelComponent>
        );
    }
}
