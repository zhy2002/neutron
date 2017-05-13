import PropTypes from 'prop-types';
import debounce from 'throttle-debounce/debounce';
import NeutronComponent from './NeutronComponent';

export default class InputComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.flushNow = () => {
            const context = this.model.getContext();
            try {
                context.flush();
            } catch (e) {
                console.warn('Rolling back session due to exception.');
                this.onUiNodeChanged(); //clear debounded values
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
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.value = this.getUiValue();
        newState.disabled = this.model.isEffectivelyDisabled();
        newState.readonly = this.props.readonly || this.model.isReadonly();
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

    renderContainerClass(clazz) {
        let containerClass = 'form-group form-group-sm';
        if (this.state.componentClass) {
            containerClass = `${containerClass} ${this.state.componentClass}`;
        }
        if (this.props.containerClass) {
            containerClass = `${containerClass} ${this.props.containerClass}`;
        }
        if (clazz) {
            containerClass = `${containerClass} ${clazz}`;
        }
        return containerClass;
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
