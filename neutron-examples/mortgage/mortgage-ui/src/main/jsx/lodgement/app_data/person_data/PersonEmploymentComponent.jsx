import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import PersonEmployedComponent from './PersonEmployedComponent';
import PersonRetiredComponent from './PersonRetiredComponent';
import PersonUnemployedComponent from './PersonUnemployedComponent';
import RemovePanelComponent from '../../../bootstrap3/RemovePanelComponent';


function PersonEmploymentComponent(props) {
    const model = props.model;
    return (
        <RemovePanelComponent className={props.componentClass} model={model}>
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-12">
                        <RadioInputComponent model={model.getEmploymentTypeNode()}/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-md-12 employment-section">
                        {props.selectedName === 'payeEmployedNode' &&
                        <PersonEmployedComponent model={model.getPayeEmployedNode()}/>
                        }
                        {props.selectedName === 'selfEmployedNode' &&
                        <PersonEmployedComponent model={model.getSelfEmployedNode()}/>
                        }
                        {props.selectedName === 'retiredEmploymentNode' &&
                        <PersonRetiredComponent model={model.getRetiredEmploymentNode()}/>
                        }
                        {props.selectedName === 'unemployedNode' &&
                        <PersonUnemployedComponent model={model.getUnemployedNode()}/>
                        }
                    </div>
                </div>
            </div>
        </RemovePanelComponent>
    );
}

export default NeutronHoc(
    PersonEmploymentComponent,
    (model) => {
        const props = {};
        props.selectedName = model.getSelectedName();
        return props;
    }
);