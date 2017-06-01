package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class ProductNodeChildProvider {


    @ComponentScope
    public static class ProductDescriptionNodeRuleProvider implements RuleProvider<ProductDescriptionNode> {

        @Inject
        public ProductDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ProductFeaturesNodeRuleProvider implements RuleProvider<ProductFeaturesNode> {

        @Inject
        public ProductFeaturesNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductFeaturesNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
