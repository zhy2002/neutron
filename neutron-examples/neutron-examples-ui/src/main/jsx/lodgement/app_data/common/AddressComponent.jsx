import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import AddressListComponent from '../../app_data/AddressListComponent';

class AddressComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {showAddressList: false};

        this.showAddressList = () => {
            this.setState({showAddressList: true});
        };

        this.hideAddressList = () => {
            this.setState({showAddressList: false});
        };

        this.selectAddress = (node) => {
            const model = this.props.model;
            model.dispatchCopyAddressAction(node);
            this.hideAddressList();
        };
    }

    render() {
        const {model, componentClass, label, disabled} = this.props;

        return (
            <div
                id={model.getUniqueId()}
                tabIndex="0"
                className={`${componentClass}`}
            >
                <label htmlFor={model.getAddressLineNode().getUniqueId()}>{label}</label>
                <button className="link" onClick={this.showAddressList} disabled={disabled}>
                    <span className="glyphicon glyphicon-search"/>
                </button>
                {this.state.showAddressList &&
                <AddressListComponent
                    contextModel={model.getContext()}
                    onHide={this.hideAddressList}
                    onSelect={this.selectAddress}
                />
                }
                <div className="grouper">
                    <TextInputComponent hideLabel model={model.getAddressLineNode()}/>
                    <div className="clearfix">
                        <TextInputComponent model={model.getSuburbNode()} containerClass="suburb"/>
                        <TextInputComponent model={model.getPostcodeNode()} containerClass="postcode"/>
                        <SelectInputComponent model={model.getCountryNode()} containerClass="country"/>
                    </div>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    AddressComponent,
    (model) => {
        const props = {};
        props.label = model.getNodeLabel();
        props.disabled = model.isEffectivelyDisabled();
        return props;
    }
);
