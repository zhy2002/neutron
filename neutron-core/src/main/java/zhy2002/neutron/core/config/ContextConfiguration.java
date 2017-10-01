package zhy2002.neutron.core.config;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple map of node configuration objects.
 */
public final class ContextConfiguration {

    private final Map<Class<?>, NodeConfiguration> map = new HashMap<>();

    public final NodeConfiguration getConfig(Class<?> nodeClass) {
        return map.computeIfAbsent(nodeClass, k -> new NodeConfiguration());
    }
}
