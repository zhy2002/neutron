package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class PayeEmployedNodeChildProvider {


    @ComponentScope
    public static class GrossYearlySalaryNodeRuleProvider implements RuleProvider<GrossYearlySalaryNode> {

        @Inject
        public GrossYearlySalaryNodeRuleProvider() {

        }

        @Override
        public void initializeState(GrossYearlySalaryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
