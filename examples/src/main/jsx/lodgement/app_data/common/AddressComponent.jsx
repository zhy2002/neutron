import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import AddressListComponent from '../../app_data/AddressListComponent';

export default class AddressComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.state.showAddressList = false;

        this.showAddressList = () => {
            this.setState({showAddressList: true});
        };

        this.hideAddressList = () => {
            this.setState({showAddressList: false});
        };

        this.selectAddress = (node) => {
            const model = this.model;
            model.getContext().beginSession();
            model.getAddressLineNode().setValue(node.getAddressLineNode().getValue());
            model.getSuburbNode().setValue(node.getSuburbNode().getValue());
            model.getPostcodeNode().setValue(node.getPostcodeNode().getValue());
            model.getCountryNode().setValue(node.getCountryNode().getValue());
            model.getContext().commitSession();
            this.hideAddressList();
        };
    }

    render() {
        const model = this.model;

        return (
            <div
                id={this.id}
                tabIndex="0"
                className={`address-component${this.state.componentClass}`}
            >
                <label htmlFor={model.getAddressLineNode().getUniqueId()}>{this.label}</label>
                <a tabIndex="0" onClick={this.showAddressList}> <span className="glyphicon glyphicon-eye-open"/></a>
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
