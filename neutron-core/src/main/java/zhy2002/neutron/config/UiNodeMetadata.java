package zhy2002.neutron.config;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that stores node type level metadata.
 */
public class UiNodeMetadata {

    private final Class<?> clazz;
    private final Map<String, Object> config = new HashMap<>();
    private final Map<String, PropertyMetadata<?>> propertyMetadataMap = new HashMap<>();

    //todo chain super node metadata

    public UiNodeMetadata(Class<?> clazz) {
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

    @SuppressWarnings("unchecked")
    public final <T> T getConfigValue(String key) {
        Object value = config.get(key);
        return (T)value;
    }

    public final void setConfigValue(String key, Object value) {
        if (value == null) {
            config.remove(key);
        } else {
            config.put(key, value);
        }
    }
}
