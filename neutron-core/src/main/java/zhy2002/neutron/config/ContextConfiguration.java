package zhy2002.neutron.config;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple map of node configuration objects.
 */
public class ContextConfiguration {

    private final Map<Class<?>, NodeConfiguration> map = new HashMap<>();

    @Inject
    public ContextConfiguration() {}

    public final NodeConfiguration getConfig(Class<?> nodeClass) {
        return map.computeIfAbsent(nodeClass, k -> new NodeConfiguration());
    }
}
