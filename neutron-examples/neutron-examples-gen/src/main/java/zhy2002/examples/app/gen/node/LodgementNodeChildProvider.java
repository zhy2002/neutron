package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.app.gen.di.*;
import java.util.*;


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

    protected void configureAppManagerNode(AppManagerNode node) {
    }

    @AppManagerNodeScope
    public static class AppManagerNodeRuleProvider implements RuleProvider<AppManagerNode> {

        @Inject
        public AppManagerNodeRuleProvider() {

        }

        @Override
        public void initializeState(AppManagerNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureAppManagerNode(node);
            return node;
        }

    }
}
