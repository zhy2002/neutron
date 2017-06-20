import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import PersonSummaryComponent from './PersonSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';
import AlertInfoComponent from '../common/AlertInfoComponent';
import CommonUtil from '../../../neutron/CommonUtil';


function renderItems(model) {
    const items = model.getChildren().map(
        item => <PersonSummaryComponent key={item.getUniqueId()} model={item}/>
    );
    if (items.length === 0) {
        items.push(
            <AlertInfoComponent>
                Click <em>Add</em> to create a new person applicant.
            </AlertInfoComponent>
        );
    }
    return items;
}

class PersonListComponent extends React.PureComponent {

    componentDidMount() {
        CommonUtil.delay().then(
            () => {
                const model = this.props.model;
                if (model.getItemCount() === 0) {
                    model.createItem();
                }
            }
        );
    }

    render() {
        const model = this.props.model;
        return (
            <MainContentComponent className={this.props.componentClass}>
                <AddListComponent model={model}>
                    {renderItems(model)}
                </AddListComponent>
            </MainContentComponent>
        );
    }
}

export default NeutronHoc(PersonListComponent);
