package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class RegisterNodeChildProvider {


    @ComponentScope
    public static class UsernameNodeRuleProvider implements RuleProvider<UsernameNode> {

        @Inject
        public UsernameNodeRuleProvider() {

        }

        @Override
        public void initializeState(UsernameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmailNodeRuleProvider implements RuleProvider<EmailNode> {

        @Inject
        public EmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmailNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PasswordNodeRuleProvider implements RuleProvider<PasswordNode> {

        @Inject
        public PasswordNodeRuleProvider() {

        }

        @Override
        public void initializeState(PasswordNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class RepeatPasswordNodeRuleProvider implements RuleProvider<RepeatPasswordNode> {

        @Inject
        public RepeatPasswordNodeRuleProvider() {

        }

        @Override
        public void initializeState(RepeatPasswordNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class AgeNodeRuleProvider implements RuleProvider<AgeNode> {

        @Inject
        public AgeNodeRuleProvider() {

        }

        @Override
        public void initializeState(AgeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PlanNodeRuleProvider implements RuleProvider<PlanNode> {

        @Inject
        public PlanNodeRuleProvider() {

        }

        @Override
        public void initializeState(PlanNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ReceiveOffersNodeRuleProvider implements RuleProvider<ReceiveOffersNode> {

        @Inject
        public ReceiveOffersNodeRuleProvider() {

        }

        @Override
        public void initializeState(ReceiveOffersNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OwnInvestmentPropertyNodeRuleProvider implements RuleProvider<OwnInvestmentPropertyNode> {

        @Inject
        public OwnInvestmentPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwnInvestmentPropertyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ResidentialPropertyNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

        @Inject
        public ResidentialPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyDetailsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class InvestmentPropertyNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

        @Inject
        public InvestmentPropertyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PropertyDetailsNode node) {
            node.setLoadWithParent(false);
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class HomePhoneNodeRuleProvider implements RuleProvider<PhoneInfoNode> {

        @Inject
        public HomePhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PhoneInfoNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

        @Inject
        public ErrorListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ErrorListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
