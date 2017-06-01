package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class RealEstateNodeChildProvider {


    @ComponentScope
    public static class UsageNodeRuleProvider implements RuleProvider<UsageNode> {

        @Inject
        public UsageNodeRuleProvider() {

        }

        @Override
        public void initializeState(UsageNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PropertyNodeRuleProvider implements RuleProvider<PropertyNode> {

        @Inject
        public PropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class AccessNodeRuleProvider implements RuleProvider<AccessNode> {

        @Inject
        public AccessNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
