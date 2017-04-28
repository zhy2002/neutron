package zhy2002.neutron.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import zhy2002.neutron.data.NodeDataStore;

/**
 * Dagger is not generating this class most likely because this Maven module is not configured with
 * Dagger compiler...
 * So manually create this class.
 */
public class ContextInstanceModule_ProvideNodeDataStoreFactory implements Factory<NodeDataStore> {

    private final ContextInstanceModule module;

    public ContextInstanceModule_ProvideNodeDataStoreFactory(ContextInstanceModule module) {
        assert module != null;
        this.module = module;
    }

    @Override
    public NodeDataStore get() {
        return Preconditions.checkNotNull(
                module.provideNodeDataStore(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<NodeDataStore> create(ContextInstanceModule contextInstanceModule) {
        return new ContextInstanceModule_ProvideNodeDataStoreFactory(contextInstanceModule);
    }

    /**
     * Proxies {@link ContextInstanceModule#provideNodeDataStore()}.
     */
    public static NodeDataStore proxyProvideNodeDataStore(ContextInstanceModule instance) {
        return instance.provideNodeDataStore();
    }

}
