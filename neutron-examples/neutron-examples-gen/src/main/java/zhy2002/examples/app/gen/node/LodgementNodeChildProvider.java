package zhy2002.examples.app.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.app.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class LodgementNodeChildProvider {


    @ComponentScope
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

}
