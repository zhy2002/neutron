package zhy2002.neutron.config;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple container of config values.
 */
public class Configuration {

    private final Map<String, Object> config = new HashMap<>();

    @Inject
    public Configuration() {}

    public Configuration(Configuration prototype) {
        config.putAll(prototype.config);
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
