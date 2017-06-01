package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class PersonNodeChildProvider {


    @ComponentScope
    public static class PersonGeneralNodeRuleProvider implements RuleProvider<PersonGeneralNode> {

        @Inject
        public PersonGeneralNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonGeneralNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonContactNodeRuleProvider implements RuleProvider<PersonContactNode> {

        @Inject
        public PersonContactNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonContactNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CurrentEmploymentListNodeRuleProvider implements RuleProvider<CurrentEmploymentListNode> {

        @Inject
        public CurrentEmploymentListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CurrentEmploymentListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PreviousEmploymentListNodeRuleProvider implements RuleProvider<PreviousEmploymentListNode> {

        @Inject
        public PreviousEmploymentListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PreviousEmploymentListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonTrustNodeRuleProvider implements RuleProvider<PersonTrustNode> {

        @Inject
        public PersonTrustNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTrustNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonPrivacyNodeRuleProvider implements RuleProvider<PersonPrivacyNode> {

        @Inject
        public PersonPrivacyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonPrivacyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonOtherIncomeListNodeRuleProvider implements RuleProvider<PersonOtherIncomeListNode> {

        @Inject
        public PersonOtherIncomeListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonOtherIncomeListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonResponsibleLendNodeRuleProvider implements RuleProvider<PersonResponsibleLendNode> {

        @Inject
        public PersonResponsibleLendNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonResponsibleLendNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
