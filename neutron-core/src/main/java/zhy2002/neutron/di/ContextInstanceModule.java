package zhy2002.neutron.di;

import dagger.Module;
import dagger.Provides;
import zhy2002.neutron.data.NodeDataStore;

import javax.inject.Singleton;

/**
 * Before a UiNodeContext is instantiated,
 * you can pass an instance of this module
 * to provide objects to the instantiation process.
 */
@Module
public class ContextInstanceModule {

    private NodeDataStore nodeDataStore;

    /**
     * This constructor is used when creating a new context.
     */
    public ContextInstanceModule() {
        this(null);
    }

    /**
     * This constructor is used when restoring an existing context.
     *
     * @param nodeDataStore the data of the context.
     */
    public ContextInstanceModule(NodeDataStore nodeDataStore) {
        this.nodeDataStore = nodeDataStore;
    }

    @Provides
    @Singleton
    public NodeDataStore provideNodeDataStore() {
        if (nodeDataStore == null) {
            nodeDataStore = new NodeDataStore(); //empty store
        }
        return nodeDataStore;
    }

}
