package zhy2002.examples.app.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface LodgementNodeChildFactory {
    AppManagerNode createAppManagerNode();
}

@Singleton
public class LodgementNodeChildProvider {
    @Inject
    MembersInjector<AppManagerNode> appManagerNodeInjector;

    @Inject
    protected LodgementNodeChildProvider () {}

    protected MembersInjector<AppManagerNode> getAppManagerNodeInjector() {
        return this.appManagerNodeInjector;
    }

    protected AppManagerNode newAppManagerNode(
        LodgementNode parent,
        String name
    ) {
        return new AppManagerNode(parent, name);
    }

    LodgementNodeChildFactory createFactory(LodgementNode parent) {
        return new LodgementNodeChildFactoryImpl(parent);
    }

    private class LodgementNodeChildFactoryImpl implements LodgementNodeChildFactory {

        private final LodgementNode parent;
        
        private LodgementNodeChildFactoryImpl(LodgementNode parent) {
            this.parent = parent;
        }

        @Override
        public AppManagerNode createAppManagerNode() {
            AppManagerNode node = newAppManagerNode(parent, "appManagerNode");
            appManagerNodeInjector.injectMembers(node);
            return node;
        }

    }
}
