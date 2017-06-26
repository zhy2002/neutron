import React from 'react';
import PropTypes from 'prop-types';
import ErrorMessageComponent from './ErrorMessageComponent';
import CommonUtil from '../neutron/CommonUtil';


/**
 * Base class for all input components.
 * There is no need to wrap descendant components into NeutronHoc.
 */
export default class InputComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.receiveProps(props);
        this.state = this.extractNewState();
        this.componentClass = CommonUtil.pascalToCssName(this.constructor.name);
    }

    componentWillReceiveProps(nextProps) {
        this.receiveProps(nextProps);
        this.onNotify();
    }

    componentWillUnmount() {
        if (this.model) {
            this.model.removeChangeListener(this);
            this.model = null;
        }
    }

    /**
     * This is called when the model has been updated.
     */
    onNotify() {
        const newState = this.extractNewState();
        this.setState(newState);
    }

    setErrorMessages(newState) {
        newState.errorMessages = this.model.getValidationMessages();
    }

    /**
     * From model value to ui state value.
     * @returns {*} the ui state value.
     */
    getUiValue() {
        return this.model.getValue();
    }

    getValueOptions() {
        return this.model.getOptions();
    }

    receiveProps({model, label, hideLabel, readonly}) {
        if (this.model !== model) {
            if (this.model) {
                this.model.removeChangeListener(this);
            }
            model.addChangeListener(this);
            this.model = model;
        }

        this.label = label;
        this.hideLabel = hideLabel;
        this.readonly = readonly;
    }

    /**
     * Get the complete state required for rendering.
     * Do not access this.props in this methods as it can be stale.
     * Use this.xxx set in receiveProps instead.
     * @returns {{}} the complete state object for rendering.
     */
    extractNewState() {
        const newState = {};
        if (this.model.getNodeStatus() !== window.GWT.NodeStatusEnum.Loaded) {
            newState.notLoaded = true;
            return newState;
        }

        newState.notLoaded = false;
        newState.disabled = this.model.isEffectivelyDisabled();
        newState.readonly = this.readonly || this.model.isEffectivelyReadonly();
        newState.hideLabel = this.hideLabel;
        if (this.label) {
            newState.label = this.label;
        } else {
            newState.label = this.model.getNodeLabel();
            if (this.model.getValueClassSimpleName && this.model.getValueClassSimpleName() === 'Boolean') {
                newState.label = CommonUtil.removeTrailing(newState.label, ' Flag');
            }
        }
        if (this.model.isDirty()) {
            newState.label = `${newState.label} *`;
        } else {
            newState.label = `${newState.label}  `;
        }
        newState.value = this.getUiValue();

        //value error message
        this.setErrorMessages(newState);

        newState.stateClass = CommonUtil.getNodeStateClasses(
            this.model,
            newState.errorMessages,
            newState.readonly,
            newState.disabled
        );

        return newState;
    }

    renderContent() {
        return `${this.componentClass} should override renderContent method.`;
    }

    render() {
        if (this.state.notLoaded)
            return null;

        const clazz = `${this.componentClass} ${this.props.className || ''} form-group form-group-sm `;
        return (
            <div className={`${clazz} ${this.state.stateClass}`}>
                {!this.state.hideLabel &&
                <label htmlFor={this.model.getUniqueId()}>{this.state.label}</label>}
                {this.renderContent()}
                <ErrorMessageComponent messages={this.state.errorMessages}/>
            </div>
        );
    }
}

InputComponent.propTypes = {
    model: PropTypes.object.isRequired,
    label: PropTypes.string,
    hideLabel: PropTypes.bool,
    readonly: PropTypes.bool,
    className: PropTypes.string
};

InputComponent.defaultProps = {
    label: null,
    hideLabel: false,
    readonly: false,
    className: ''
};
