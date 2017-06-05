package zhy2002.neutron.config;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.ChangeTrackingModeEnum;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Helper class to build a property metadata object.
 */
class PropertyMetadataBuilder<T> {

    private final Class<?> definingClass;
    private final String name;
    private final Class<T> valueClass;
    private T defaultValue = null;
    private ChangeTrackingModeEnum changeTrackingMode;
    private ChangeModeEnum changeMode = ChangeModeEnum.CASCADE;
    private boolean configurable = true;
    private boolean inherited = false;

    public PropertyMetadataBuilder(
            Class<?> definingClass,
            String name,
            Class<T> valueClass
    ) {
        this.definingClass = definingClass;
        this.name = name;
        this.valueClass = valueClass;
        this.changeTrackingMode = getDefaultChangeTrackingMode(valueClass);
    }

    public PropertyMetadataBuilder<T> setDefaultValue(T defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public PropertyMetadataBuilder<T> setChangeTrackingMode(ChangeTrackingModeEnum changeTrackingMode) {
        this.changeTrackingMode = changeTrackingMode;
        return this;
    }

    public PropertyMetadataBuilder<T> setChangeMode(ChangeModeEnum changeMode) {
        this.changeMode = changeMode;
        return this;
    }

    public PropertyMetadataBuilder<T> setConfigurable(boolean configurable) {
        this.configurable = configurable;
        return this;
    }

    public PropertyMetadataBuilder<T> setInherited(boolean inherited) {
        this.inherited = inherited;
        return this;
    }

    public PropertyMetadata<T> build() {
        return new PropertyMetadata<>(
                this.definingClass,
                this.name,
                this.valueClass,
                this.defaultValue,
                this.changeTrackingMode,
                this.changeMode,
                this.configurable,
                this.inherited
        );
    }

    private static @NotNull
    ChangeTrackingModeEnum getDefaultChangeTrackingMode(Class<?> valueClass) {
        if (valueClass == Boolean.class || valueClass == Integer.class || valueClass == BigDecimal.class)
            return ChangeTrackingModeEnum.Value;

        return ChangeTrackingModeEnum.Reference;
    }
}
