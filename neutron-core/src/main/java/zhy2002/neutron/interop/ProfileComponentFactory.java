package zhy2002.neutron.interop;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.di.ProfileComponent;
import zhy2002.neutron.util.NeutronConstants;

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
    void put(String profileName, Function<NodeDataStore, ProfileComponent<C>> createFunc) {
        map.put(profileName, createFunc);
    }

    public ProfileComponent<C> create(String profileName, NodeDataStore store) {
        Function<NodeDataStore, ProfileComponent<C>> creator = map.get(profileName);
        if (creator == null)
            return null;

        return creator.apply(store);
    }
}
