package zhy2002.neutron.core.config;

import zhy2002.neutron.core.ChangeModeEnum;
import zhy2002.neutron.core.ChangeTrackingModeEnum;

import javax.validation.constraints.NotNull;

/**
 * Metadata for a node property.
 */
public final class PropertyMetadata<T> {

    /**
     * The defining class of this property (can be abstract or concrete).
     */
    private final Class<?> definingClass;
    /**
     * Unique property name within the defining class.
     */
    private final String name;
    /**
     * Value type of the property.
     */
    private final Class<T> valueClass;
    /**
     * A constant default value which will be returned when
     * all value sources return null for this property.
     */
    private final T defaultValue;
    /**
     * Defines when a change event is triggered by
     * comparing the old and new values.
     */
    private final ChangeTrackingModeEnum changeTrackingMode;
    /**
     * Whether to bypass the event system.
     */
    private final ChangeModeEnum changeMode;
    /**
     * Decide whether to check configuration for value
     * when property value is not found in node state.
     */
    private final boolean configurable;
    /**
     * Decide whether to check parent node for value
     * when property value is not found in node state and configuration.
     */
    private final boolean inherited;
    /**
     * Calculated token used to access property value in state.
     */
    private final String stateKey;

    PropertyMetadata(
            Class<?> definingClass,
            String name,
            Class<T> valueClass,
            T defaultValue,
            ChangeTrackingModeEnum changeTrackingMode,
            ChangeModeEnum changeMode,
            boolean configurable,
            boolean inherited
    ) {
        this.definingClass = definingClass;
        this.name = name;
        this.stateKey = definingClass.getSimpleName() + "#" + name;
        this.valueClass = valueClass;
        this.defaultValue = defaultValue;
        this.changeTrackingMode = changeTrackingMode;
        this.changeMode = changeMode;
        this.configurable = configurable;
        this.inherited = inherited;
    }

    @NotNull
    public Class<?> getDefiningClass() {
        return definingClass;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getStateKey() {
        return stateKey;
    }

    @NotNull
    public Class<T> getValueClass() {
        return valueClass;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    @NotNull
    public ChangeTrackingModeEnum getChangeTrackingMode() {
        return changeTrackingMode;
    }

    @NotNull
    public ChangeModeEnum getChangeMode() {
        return changeMode;
    }

    public boolean isConfigurable() {
        return configurable;
    }

    public boolean isInherited() {
        return inherited;
    }


}
