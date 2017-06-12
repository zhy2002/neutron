import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';
import LocationService from '../../services/LocationService';


class TabContentComponent extends React.PureComponent {

    componentDidMount() {
        LocationService.syncHashToState(this.props.model, true);
    }

    componentDidUpdate() {
        LocationService.syncHashToState(this.props.model, true);
    }

    renderTabContent(className, model) {
        console.log(`${this.props.label} ${className} ${model}`);
    }

    render() {
        const model = this.props.selectedItem;
        const className = model.getConcreteClassName();
        const component = this.props.renderTabContent(className, model);

        return (
            <div className={this.props.componentClass}>
                {component ||
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-12">
                            <em>unknown model type {className}</em>
                        </div>
                    </div>
                </div>}
            </div>
        );
    }
}

TabContentComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(
    TabContentComponent,
    (model) => {
        const props = {};
        const selectedName = model.getSelectedName();
        props.selectedItem = model.getChildByName(selectedName);
        return props;
    },
    {
        renderTabContent: PropTypes.func.isRequired
    }
);
