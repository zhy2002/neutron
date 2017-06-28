package zhy2002.neutron.config;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.ChangeTrackingModeEnum;

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
        return createProperty(definingClass, propertyName, valueClass, defaultValue, tracingMode, changeMode, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum tracingMode, ChangeModeEnum changeMode, Boolean configurable) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, tracingMode, changeMode, null, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum tracingMode, ChangeModeEnum changeMode, Boolean configurable, Boolean inherited) {

        PropertyMetadataBuilder<T> builder = new PropertyMetadataBuilder<>(
                definingClass,
                propertyName,
                valueClass
        );
        if (defaultValue != null) {
            builder.setDefaultValue(defaultValue);
        }
        if (tracingMode != null) {
            builder.setChangeTrackingMode(tracingMode);
        }
        if (changeMode != null) {
            builder.setChangeMode(changeMode);
        }
        if (configurable != null) {
            builder.setConfigurable(configurable);
        }

        if (inherited != null) {
            builder.setInherited(inherited);
        }

        PropertyMetadata<T> propertyMetadata = builder.build();
        UiNodeMetadata nodeMetadata = getClassMetadata(definingClass);
        nodeMetadata.addPropertyMetadata(propertyMetadata);
        return propertyMetadata;
    }

    public static UiNodeMetadata getClassMetadata(Class<?> definingClass) {
        return uiNodeMetadataMap.computeIfAbsent(definingClass, UiNodeMetadata::new);
    }

}
