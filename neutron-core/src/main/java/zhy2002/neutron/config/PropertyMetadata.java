package zhy2002.neutron.config;

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
    private final ChangeTrackingModeEnum changeTrackingMode;
    private final T defaultValue;

    PropertyMetadata(Class<?> definingClass, String name, Class<T> valueClass, ChangeTrackingModeEnum changeTrackingMode, T defaultValue) {
        this.definingClass = definingClass;
        this.name = name;
        this.stateKey = ValueUtil.camelToConstantLower(name);
        this.valueClass = valueClass;
        this.changeTrackingMode = changeTrackingMode;
        this.defaultValue = defaultValue;
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

    @NotNull
    public ChangeTrackingModeEnum getChangeTrackingMode() {
        return changeTrackingMode;
    }

    public T getDefaultValue() {
        return defaultValue;
    }
}
