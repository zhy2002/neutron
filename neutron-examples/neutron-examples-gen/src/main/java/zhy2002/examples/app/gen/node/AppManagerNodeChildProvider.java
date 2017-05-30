package zhy2002.examples.app.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.app.gen.di.*;
import java.util.*;


interface AppManagerNodeChildFactory {
    ApplicationListNode createApplicationListNode();
}

@Singleton
public class AppManagerNodeChildProvider {
    @Inject
    MembersInjector<ApplicationListNode> applicationListNodeInjector;

    @Inject
    protected AppManagerNodeChildProvider () {}

    protected MembersInjector<ApplicationListNode> getApplicationListNodeInjector() {
        return this.applicationListNodeInjector;
    }

    protected ApplicationListNode newApplicationListNode(
        AppManagerNode parent,
        String name
    ) {
        return new ApplicationListNode(parent, name);
    }

    protected void configureApplicationListNode(ApplicationListNode node) {
    }

    @ApplicationListNodeScope
    public static class ApplicationListNodeRuleProvider implements RuleProvider<ApplicationListNode> {

        @Inject
        public ApplicationListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ApplicationListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    AppManagerNodeChildFactory createFactory(AppManagerNode parent) {
        return new AppManagerNodeChildFactoryImpl(parent);
    }

    private class AppManagerNodeChildFactoryImpl implements AppManagerNodeChildFactory {

        private final AppManagerNode parent;
        
        private AppManagerNodeChildFactoryImpl(AppManagerNode parent) {
            this.parent = parent;
        }

        @Override
        public ApplicationListNode createApplicationListNode() {
            ApplicationListNode node = newApplicationListNode(parent, "applicationListNode");
            applicationListNodeInjector.injectMembers(node);
            configureApplicationListNode(node);
            return node;
        }

    }
}
