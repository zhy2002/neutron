import React from 'react';
import PropTypes from 'prop-types';
import CommonUtil from './CommonUtil';


/**
 * Enable wrapped component to understand Neuron node property.
 */
function NeutronHoc(WrappedComponent,
                    mapModelToProps = CommonUtil.mapToEmptyObject,
                    propTypes = {},
                    defaultProps = {}) {
    function extractNewState(props) {
        const model = props.model;
        if (!model)
            return {};

        const newState = Object.assign({}, props); //pass through all
        if (model.getNodeStatus() === window.GWT.NodeStatusEnum.Loaded) {
            newState.componentClass = CommonUtil.pascalToCssName(WrappedComponent.name);
        }
        if (model.getChildNames) {
            newState.childNames = model.getChildNames(); //ensure list is re-rendered
        }
        if (mapModelToProps) {
            return Object.assign(newState, mapModelToProps(model, props));
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
            if (!this.state.model || !this.state.componentClass)
                return null;

            //console.warn(`rendering ${WrappedComponent.name}`);
            return <WrappedComponent {...this.state} />;
        }
    }

    NeutronWrapper.WrappedComponent = WrappedComponent;
    NeutronWrapper.displayName = `NeutronWrapper(${CommonUtil.getDisplayName(WrappedComponent)})`;

    NeutronWrapper.propTypes = Object.assign(
        {model: PropTypes.object},
        propTypes
    );

    NeutronWrapper.defaultProps = Object.assign(
        {model: null},
        defaultProps
    );

    return NeutronWrapper;
}

export default NeutronHoc;
