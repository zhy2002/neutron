import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import PersonEmployedComponent from './PersonEmployedComponent';
import PersonRetiredComponent from './PersonRetiredComponent';
import PersonUnemployedComponent from './PersonUnemployedComponent';

export default class PersonEmploymentComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            if (window.confirm('Are you sure you want to delete this employment record?')) {
                this.model.getParent().removeItem(this.model);
            }
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.selectedName = this.model.getSelectedName();
        return newState;
    }

    render() {
        const model = this.model;
        return (
            <div className="person-employment-component">
                <div className="container-fluid compact">
                    <div className="row">
                        <div className="col-md-2">
                            <button className="btn btn-sm btn-warning pull-right" onClick={this.removeItem}>
                                Remove
                            </button>
                        </div>
                        <div className="col-md-10">
                            <div className="container-fluid">
                                <div className="row">
                                    <div className="col-md-12">
                                        <RadioInputComponent model={model.getEmploymentTypeNode()}/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="row">
                        <div className="col-md-offset-2 col-md-10">
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
            </div>
        );
    }
}