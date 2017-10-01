package zhy2002.neutron.core.config;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that stores node type level metadata.
 * Metadata is comprised of compile time constants.
 */
public final class ClassMetadata {

    private final Class<?> clazz;

    private final Map<String, PropertyMetadata<?>> propertyMetadataMap = new HashMap<>();

    ClassMetadata(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public final PropertyMetadata<?> getPropertyMetadata(String propertyName) {
        return propertyMetadataMap.get(propertyName);
    }

    final void addPropertyMetadata(PropertyMetadata<?> propertyMetadata) {
        propertyMetadataMap.put(propertyMetadata.getName(), propertyMetadata);
    }

}
