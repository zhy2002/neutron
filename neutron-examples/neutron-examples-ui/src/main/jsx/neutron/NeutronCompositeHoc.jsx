import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from './NeutronHoc';
import CommonUtil from './CommonUtil';

/**
 * Enable the wrapped component to understand a composite Neutron node.
 */
export default function NeutronCompositeHoc(WrappedComponent,
                                            mapModelToProps = CommonUtil.mapToEmptyObject,
                                            propTypes = {},
                                            defaultProps = {}) {
    function NeutronCompositeWrapper(props) {
        return <WrappedComponent {...props}/>;
    }

    NeutronCompositeWrapper.WrappedComponent = WrappedComponent;
    NeutronCompositeWrapper.displayName = `NeutronCompositeWrapper(${CommonUtil.getDisplayName(WrappedComponent)})`;

    function compositeMapModelToProps(model, receivedProps) {
        const props = {};

        props.disabled = model.isEffectivelyDisabled();
        props.readonly = receivedProps.readonly || model.isEffectivelyReadonly();
        props.errorMessages = model.getValidationMessages();
        props.stateClass = CommonUtil.getNodeStateClasses(
            model,
            props.errorMessages,
            props.readonly,
            props.disabled
        );
        props.componentClass = CommonUtil.pascalToCssName(WrappedComponent.name); //override componentClass

        return Object.assign(
            props,
            mapModelToProps(model, receivedProps)
        );
    }

    const compositePropTypes = Object.assign(
        {readonly: PropTypes.bool},
        propTypes
    );

    const compositeDefaultProps = Object.assign(
        {readonly: false},
        defaultProps
    );

    return NeutronHoc(
        NeutronCompositeWrapper,
        compositeMapModelToProps,
        compositePropTypes,
        compositeDefaultProps
    );
}
