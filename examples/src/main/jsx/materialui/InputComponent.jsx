import React from 'react';
import NeutronComponent from './NeutronComponent';


export default class InputComponent extends NeutronComponent {

    receiveProps(props) {
        super.receiveProps(props);

        this.columnStyle = props.columnStyle || {};
    }
}

InputComponent.propTypes = {
    columnStyle: React.PropTypes.object
};
