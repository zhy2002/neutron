import React from 'react';
import NeutronCompositeHoc from '../../../neutron/NeutronCompositeHoc';
import NodeLabelComponent from '../../../neutron/NodeLabelComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import ErrorMessageComponent from '../../../bootstrap3/ErrorMessageComponent';
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
            this.props.model.dispatchCopyAddressAction(node);
            this.hideAddressList();
        };

        this.resetAddress = () => {
            this.props.model.resetValue();
        };
    }

    render() {
        const {model, componentClass, stateClass, readonly, disabled, errorMessages} = this.props;

        return (
            <div
                id={model.getUniqueId()}
                tabIndex="0"
                className={`${componentClass} ${stateClass}`}
            >
                <label htmlFor={model.getAddressLineNode().getUniqueId()}>
                    <NodeLabelComponent model={model}/>
                </label>
                <button className="link" onClick={this.showAddressList} disabled={readonly || disabled}>
                    <span className="glyphicon glyphicon-search"/>
                </button>
                <button className="link" onClick={this.resetAddress} disabled={readonly || disabled}>
                    <span className="glyphicon glyphicon-erase"/>
                </button>
                {this.state.showAddressList &&
                <AddressListComponent
                    contextModel={model.getContext()}
                    onHide={this.hideAddressList}
                    onSelect={this.selectAddress}
                />
                }
                <div className="grouper">
                    <TextInputComponent hideLabel model={model.getAddressLineNode()} readonly={readonly}/>
                    <div className="clearfix">
                        <TextInputComponent model={model.getSuburbNode()} readonly={readonly} className="suburb"/>
                        <TextInputComponent model={model.getPostcodeNode()} readonly={readonly} className="postcode"/>
                        <SelectInputComponent model={model.getCountryNode()} readonly={readonly} className="country"/>
                    </div>
                </div>
                <ErrorMessageComponent messages={errorMessages}/>
            </div>
        );
    }
}

export default NeutronCompositeHoc(AddressComponent);
