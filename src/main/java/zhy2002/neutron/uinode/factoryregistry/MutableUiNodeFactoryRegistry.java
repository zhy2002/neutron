package zhy2002.neutron.uinode.factoryregistry;

import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Used to overwrite default (generated) ui node factory.
 */
public class MutableUiNodeFactoryRegistry implements UiNodeFactoryRegistry {

    private UiNodeFactoryRegistry parent;
    private final Map<String, ? super UiNodeFactory> storage = new HashMap<>();

    public MutableUiNodeFactoryRegistry() {
    }

    public MutableUiNodeFactoryRegistry(UiNodeFactoryRegistry parent) {
        this.parent = parent;
    }

    public void setParent(UiNodeFactoryRegistry parent) {
        this.parent = parent;
    }


    public <N extends UiNode<P>, P extends ParentUiNode<?>, F extends UiNodeFactory<N, P>> void register(Class<N> nodeClass, F instance) {
        storage.put(nodeClass.getName(), instance);
    }

    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>, F extends UiNodeFactory<N, P>> F getInstance(Class<N> nodeClass) {
        String key = nodeClass.getName();
        if (storage.containsKey(key))
            return (F) storage.get(key);
        if (parent != null)
            return parent.getInstance(nodeClass);
        return null;
    }
}
