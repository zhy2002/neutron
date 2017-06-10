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

        if (model.getChildNames) {
            newState.childNames = model.getChildNames(); //ensure list is re-rendered
        }

        //error message
        // newState.errorMessage = '';
        // const errorList = model.getValidationErrorList();
        // if (errorList) {
        //     for (let i = 0; i < errorList.size(); i++) {
        //         const item = errorList.get(i);
        //         newState.errorMessage += `${item.getMessage()} `;
        //     }
        // }

        //
        // //component class
        // let componentClass = '';
        // if (newState.errorMessage) {
        //     componentClass = ' has-error';
        // } else if (this.model.getRequired() && !this.model.hasValue() && !this.model.isEffectivelyDisabled()) {
        //     componentClass = ' missing-value';
        // }
        // const visibility = model.getVisibility();
        // if (visibility === 'none') {
        //     componentClass += ' hide';
        // } else if (visibility === 'hidden') {
        //     componentClass += ' invisible';
        // }
        // newState.componentClass = componentClass;

        //label
        // if (this.props.label) {
        //     newState.label = this.props.label;
        // } else {
        //     newState.label = this.model.getNodeLabel();
        // }
        // if (this.model.isDirty()) {
        //     newState.label = `${newState.label} *`;
        // } else {
        //     newState.label = `${newState.label} `;
        // }

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

            return <WrappedComponent {...this.state} />;
        }
    }

    NeutronWrapper.WrappedComponent = WrappedComponent;
    NeutronWrapper.displayName = `NeutronWrapper(${CommonUtil.getDisplayName(WrappedComponent)})`;

    NeutronWrapper.propTypes = Object.assign(
        {
            model: PropTypes.object,
            componentClass: PropTypes.string
        },
        propTypes
    );

    NeutronWrapper.defaultProps = Object.assign(
        {
            model: null,
            componentClass: ''
        },
        defaultProps
    );

    return NeutronWrapper;
}

NeutronHoc.suppressMissingPropTypes = () => {
    return {};
};

export default NeutronHoc;
