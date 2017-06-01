package zhy2002.examples.app.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.app.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class AppManagerNodeChildProvider {


    @ComponentScope
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

}
