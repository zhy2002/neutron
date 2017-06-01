package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class PropertyDetailsNodeChildProvider {


    @ComponentScope
    public static class PropertyAddressNodeRuleProvider implements RuleProvider<PropertyAddressNode> {

        @Inject
        public PropertyAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PropertyStateNodeRuleProvider implements RuleProvider<PropertyStateNode> {

        @Inject
        public PropertyStateNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyStateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
