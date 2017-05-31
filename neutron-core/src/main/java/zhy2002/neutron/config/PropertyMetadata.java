package zhy2002.neutron.config;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.ChangeTrackingModeEnum;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;

/**
 * Metadata for a node property.
 */
public final class PropertyMetadata<T> {

    private final Class<?> definingClass;
    private final String name;
    private final String stateKey;
    private final Class<T> valueClass;
    private final T defaultValue;
    private final ChangeTrackingModeEnum changeTrackingMode;
    private final ChangeModeEnum changeMode;
    private final boolean configurable;

    PropertyMetadata(Class<?> definingClass, String name, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum changeTrackingMode, ChangeModeEnum changeMode, boolean configurable) {
        this.definingClass = definingClass;
        this.name = name;
        this.stateKey = ValueUtil.camelToConstantLower(name);
        this.valueClass = valueClass;
        this.defaultValue = defaultValue;
        this.changeTrackingMode = changeTrackingMode;
        this.changeMode = changeMode;
        this.configurable = configurable;
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
}
