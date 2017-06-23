import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import AddListComponent from '../common/AddListComponent';
import PersonSummaryComponent from './PersonSummaryComponent';
import MainContentComponent from '../common/MainContentComponent';
import CommonUtil from '../../../neutron/CommonUtil';


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
        return (
            <MainContentComponent className={this.props.componentClass}>
                <AddListComponent model={this.props.model} itemComponent={PersonSummaryComponent}/>
            </MainContentComponent>
        );
    }
}

export default NeutronHoc(PersonListComponent);
