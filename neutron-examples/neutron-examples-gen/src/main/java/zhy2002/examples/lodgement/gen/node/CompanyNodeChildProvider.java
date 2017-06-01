package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class CompanyNodeChildProvider {


    @ComponentScope
    public static class CompanyGeneralNodeRuleProvider implements RuleProvider<CompanyGeneralNode> {

        @Inject
        public CompanyGeneralNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyGeneralNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CompanyContactNodeRuleProvider implements RuleProvider<CompanyContactNode> {

        @Inject
        public CompanyContactNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyContactNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CompanyTrustNodeRuleProvider implements RuleProvider<CompanyTrustNode> {

        @Inject
        public CompanyTrustNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyTrustNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CompanyPrivacyNodeRuleProvider implements RuleProvider<CompanyPrivacyNode> {

        @Inject
        public CompanyPrivacyNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyPrivacyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CompanyOtherIncomeListNodeRuleProvider implements RuleProvider<CompanyOtherIncomeListNode> {

        @Inject
        public CompanyOtherIncomeListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyOtherIncomeListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CompanyResponsibleLendNodeRuleProvider implements RuleProvider<CompanyResponsibleLendNode> {

        @Inject
        public CompanyResponsibleLendNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyResponsibleLendNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
