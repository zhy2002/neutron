package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class ProductFeeNodeChildProvider {


    @ComponentScope
    public static class FeeTypeNodeRuleProvider implements RuleProvider<FeeTypeNode> {

        @Inject
        public FeeTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class FeeDescriptionNodeRuleProvider implements RuleProvider<FeeDescriptionNode> {

        @Inject
        public FeeDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class FeePayFromNodeRuleProvider implements RuleProvider<FeePayFromNode> {

        @Inject
        public FeePayFromNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeePayFromNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class FeeAmountNodeRuleProvider implements RuleProvider<FeeAmountNode> {

        @Inject
        public FeeAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(FeeAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
