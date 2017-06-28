package zhy2002.neutron.config;

import jsinterop.annotations.JsMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A simple container of config values.
 * NODE: config override by key literal value
 */
public class NodeConfiguration {

    private final String name;
    private final Map<String, Object> map = new HashMap<>();

    public NodeConfiguration() {
        this(null); //for type config
    }

    public NodeConfiguration(String name) {
        this.name = name; //for instance config
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public final <T> T getConfigValue(String key) {
        Object value = map.get(key);
        return (T) value;
    }

    @JsMethod
    public final void setConfigValue(String key, Object value) {
        if (value == null) {
            map.remove(key);
        } else {
            map.put(key, value);
        }
    }

    public final Set<String> allKeys() {
        return map.keySet();
    }

    public void merge(NodeConfiguration config) {
        for (String key : config.allKeys()) {
            int index = key.indexOf("/");
            if (index < 0 || !name.matches(key.substring(0, index)))
                continue;
            String rest = key.charAt(index + 1) == '@' ? key.substring(index + 2) : key.substring(index + 1);
            setConfigValue(rest, config.getConfigValue(key));
        }
    }
}
