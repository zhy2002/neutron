package zhy2002.neutron.config;

import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.ChangeTrackingModeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Use static methods to createProperty property metadata.
 */
public class MetadataRegistry {

    private static final Map<Class<?>, UiNodeMetadata> uiNodeMetadataMap = new HashMap<>();

    private MetadataRegistry() {
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass) {
        return createProperty(definingClass, propertyName, valueClass, null, null, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, ChangeTrackingModeEnum trackingMode) {
        return createProperty(definingClass, propertyName, valueClass, null, trackingMode, null);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeModeEnum changeMode) {
        return createProperty(definingClass, propertyName, valueClass, defaultValue, null, changeMode);
    }

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue, ChangeTrackingModeEnum mode, ChangeModeEnum changeMode) {

        if (mode == null) {
            mode = getDefaultChangeTrackingMode(valueClass);
        }

        if (changeMode == null) {
            changeMode = ChangeModeEnum.CASCADE;
        }

        PropertyMetadata<T> propertyMetadata = new PropertyMetadata<>(
                definingClass,
                propertyName,
                valueClass,
                defaultValue,
                mode,
                changeMode
        );
        UiNodeMetadata nodeMetadata = getClassMetadata(definingClass);
        nodeMetadata.addPropertyMetadata(propertyMetadata);
        return propertyMetadata;
    }

    public static UiNodeMetadata getClassMetadata(Class<?> definingClass) {
        return uiNodeMetadataMap.computeIfAbsent(definingClass, UiNodeMetadata::new);
    }

    private static ChangeTrackingModeEnum getDefaultChangeTrackingMode(Class<?> valueClass) {
        if (valueClass == Boolean.class || valueClass == Integer.class || valueClass == String.class)
            return ChangeTrackingModeEnum.Value;

        return ChangeTrackingModeEnum.Reference;
    }

}
