package zhy2002.neutron.uinode;

import zhy2002.neutron.uinode.factoryregistry.UiNodeFactory;
import zhy2002.neutron.uinode.factoryregistry.UiNodeFactoryRegistry;

/**
 * Created by ZHY on 23/10/2016.
 */
public class UiNodeContext implements UiNodeFactoryRegistry {

    private final UiNodeFactoryRegistry registry;

    public UiNodeContext(UiNodeFactoryRegistry registry) {
        this.registry = registry;
    }


    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>, F extends UiNodeFactory<N, P>> F getInstance(Class<N> factoryClass) {
        return registry.getInstance(factoryClass);
    }
}
