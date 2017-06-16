import React from 'react';
import PropTypes from 'prop-types';
import CommonUtil from './CommonUtil';

function defaultMapModelToProps() {
    return {};
}

function NeutronHoc(WrappedComponent,
                    mapModelToProps = defaultMapModelToProps,
                    propTypes = {},
                    defaultProps = {}) {
    function extractNewState(props) {
        const newState = Object.assign({}, props); //pass through all

        const model = newState.model;
        if (!model)
            return newState;

        if (!newState.componentClass) {
            newState.componentClass = CommonUtil.pascalToCssName(WrappedComponent.name);
        }

        //label
        if (props.label) {
            newState.label = props.label;
        } else {
            newState.label = model.getNodeLabel();
        }
        if (model.isDirty()) {
            newState.label = `${newState.label} *`;
        } else {
            newState.label = `${newState.label} `;
        }

        if (model.getChildNames) {
            newState.childNames = model.getChildNames(); //ensure list is re-rendered
        }

        newState.disabled = props.disabled || model.isEffectivelyDisabled();

        if (mapModelToProps) {
            return Object.assign(newState, mapModelToProps(model));
        }
        return newState;
    }

    class NeutronWrapper extends React.PureComponent {

        constructor(props) {
            super(props);

            this.bindToModel(props);
            this.state = extractNewState(props, mapModelToProps);
        }

        componentWillReceiveProps(nextProps) {
            this.bindToModel(nextProps);
            this.onNotify(nextProps);
        }

        componentWillUnmount() {
            this.unbindModel();
        }

        onNotify(props) {
            const currentProps = props === null ? this.props : props;
            const newState = extractNewState(currentProps, mapModelToProps);
            this.setState(newState);
        }

        bindToModel(props) {
            const model = props.model;
            if (this.model !== model) {
                if (this.model) {
                    this.model.removeChangeListener(this);
                }

                if (model) {
                    model.addChangeListener(this);
                }
                this.model = model;
            }
        }

        unbindModel() {
            if (this.model) {
                this.model.removeChangeListener(this);
                this.model = null;
            }
        }

        render() {
            if (!this.state.model || this.state.model.getNodeStatus() !== window.GWT.NodeStatusEnum.Loaded)
                return null;

            //console.log(`rendering ${WrappedComponent.name}`);
            return <WrappedComponent {...this.state} />;
        }
    }

    NeutronWrapper.WrappedComponent = WrappedComponent;
    NeutronWrapper.displayName = `NeutronWrapper(${CommonUtil.getDisplayName(WrappedComponent)})`;

    NeutronWrapper.propTypes = Object.assign(
        {
            model: PropTypes.object,
            componentClass: PropTypes.string,
            label: PropTypes.string,
            disabled: PropTypes.bool
        },
        propTypes
    );

    NeutronWrapper.defaultProps = Object.assign(
        {
            model: null,
            componentClass: '',
            label: null,
            disabled: false
        },
        defaultProps
    );

    return NeutronWrapper;
}

export default NeutronHoc;
