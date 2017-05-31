package zhy2002.neutron.config;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.ChangeTrackingModeEnum;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * This class offers static methods to createProperty property metadata.
 * todo add a builder for PropertyMetadata.
 */
public class MetadataRegistry {

    private static final Map<Class<?>, UiNodeMetadata> uiNodeMetadataMap = new HashMap<>();

    private MetadataRegistry() {
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass) {
        return createProperty(definingClass, propertyName, valueClass, null, null, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, null, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, ChangeTrackingModeEnum trackingMode) {
        return createProperty(definingClass, propertyName, valueClass, null, trackingMode, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeModeEnum changeMode) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, null, changeMode);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum trackingMode) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, trackingMode, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum tracingMode, ChangeModeEnum changeMode) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, tracingMode, changeMode, false);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum tracingMode, ChangeModeEnum changeMode, boolean configurable) {

        if (tracingMode == null) {
            tracingMode = getDefaultChangeTrackingMode(valueClass);
        }

        if (changeMode == null) {
            changeMode = ChangeModeEnum.CASCADE;
        }

        PropertyMetadata<T> propertyMetadata = new PropertyMetadata<>(
                definingClass,
                propertyName,
                valueClass,
                defaultValue,
                tracingMode,
                changeMode,
                configurable
        );
        UiNodeMetadata nodeMetadata = getClassMetadata(definingClass);
        nodeMetadata.addPropertyMetadata(propertyMetadata);
        return propertyMetadata;
    }

    public static UiNodeMetadata getClassMetadata(Class<?> definingClass) {
        return uiNodeMetadataMap.computeIfAbsent(definingClass, UiNodeMetadata::new);
    }

    private static @NotNull
    ChangeTrackingModeEnum getDefaultChangeTrackingMode(Class<?> valueClass) {
        if (valueClass == Boolean.class || valueClass == Integer.class || valueClass == BigDecimal.class)
            return ChangeTrackingModeEnum.Value;

        return ChangeTrackingModeEnum.Reference;
    }

}
