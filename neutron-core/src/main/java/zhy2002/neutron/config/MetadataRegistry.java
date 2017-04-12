package zhy2002.neutron.config;

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

    public static <T> PropertyMetadata<T> createProperty(Class<?> definingClass, String propertyName, Class<T> valueClass, T defaultValue) {
        PropertyMetadata<T> propertyMetadata = new PropertyMetadata<>(
                definingClass,
                propertyName,
                valueClass,
                getDefaultChangeTrackingMode(valueClass),
                defaultValue
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
