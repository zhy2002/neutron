package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class ProductCardHolderNodeChildProvider {


    @ComponentScope
    public static class ProductCardHodlerNameNodeRuleProvider implements RuleProvider<ProductCardHodlerNameNode> {

        @Inject
        public ProductCardHodlerNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCardHodlerNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ProductRewardsProgramNodeRuleProvider implements RuleProvider<ProductRewardsProgramNode> {

        @Inject
        public ProductRewardsProgramNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRewardsProgramNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ProductRewardsMembershipNodeRuleProvider implements RuleProvider<ProductRewardsMembershipNode> {

        @Inject
        public ProductRewardsMembershipNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRewardsMembershipNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
