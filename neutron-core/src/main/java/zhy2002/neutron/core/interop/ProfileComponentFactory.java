package zhy2002.neutron.core.interop;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.core.UiNodeContext;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.data.NodeDataStore;
import zhy2002.neutron.core.di.ProfileComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * A factory that creates profile component instances.
 *
 * @param <C> type of the node context the created component contains.
 */
@JsType(name = NeutronConstants.JS_NAMESPACE)
public final class ProfileComponentFactory<C extends UiNodeContext<?>> {

    @JsIgnore
    private final Map<String, Function<NodeDataStore, ProfileComponent<C>>> map = new HashMap<>();

    @JsIgnore
    public void put(String profileName, Function<NodeDataStore, ProfileComponent<C>> createFunc) {
        map.put(profileName, createFunc);
    }

    public ProfileComponent<C> create(String profileName, NodeDataStore store) {
        Function<NodeDataStore, ProfileComponent<C>> creator = map.get(profileName);
        if (creator == null)
            return null;

        return creator.apply(store);
    }

    public String[] getAllProfileNames() {
        String[] names = new String[map.size()];
        map.keySet().toArray(names);
        return names;
    }
}
