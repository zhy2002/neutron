import React from 'react';
import PropTypes from 'prop-types';
import debounce from 'throttle-debounce/debounce';
import NeutronComponent from './NeutronComponent';
import ErrorMessageComponent from './ErrorMessageComponent';

export default class InputComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.flushNow = () => {
            const context = this.model.getContext();
            try {
                context.flush();
            } catch (e) {
                console.warn('Rolling back session due to exception.');
                this.onNotify(); //clear debounded values
            }
            context.setCycleMode(context.oldCycleMode);
            delete context.oldCycleMode;
        };

        this.flush = debounce(350, this.flushNow);

        this.ensureDebouncingMode = () => {
            const context = this.model.getContext();
            if (context.getCycleMode() !== GWT.CycleModeEnum.Debouncing) {
                context.oldCycleMode = context.getCycleMode();
                context.setCycleMode(GWT.CycleModeEnum.Debouncing);
            }
        };

        this.identifierClass = '';
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.value = this.getUiValue();
        newState.disabled = this.model.isEffectivelyDisabled();
        newState.readonly = this.props.readonly || this.model.isEffectivelyReadonly();
        newState.hideLabel = this.props.hideLabel;

        if (newState.disabled) {
            newState.componentClass += ' disabled';
        } else if (newState.readonly) {
            newState.componentClass += ' readonly';
            newState.componentClass = newState.componentClass.replace(' missing-value', '');
        }

        return newState;
    }

    /**
     * From model value to ui value.
     * @returns {*} the model value.
     */
    getUiValue() {
        return this.model.getValue();
    }

    getValueOptions() {
        return this.model.getOptions();
    }

    renderContent() {
        return `content of ${this.identifierClass}`;
    }

    render() {
        const model = this.model;
        const clazz = `form-group form-group-sm ${this.identifierClass} ${this.props.containerClass}`;
        return (
            <div className={`${clazz} ${this.state.componentClass}`}>
                {!this.state.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.state.label}</label>
                }
                {this.renderContent()}
                <ErrorMessageComponent message={this.state.errorMessage}/>
            </div>
        );
    }
}

InputComponent.propTypes = {
    containerClass: PropTypes.string,
    readonly: PropTypes.bool
};

InputComponent.defaultProps = {
    containerClass: '',
    readonly: false
};
