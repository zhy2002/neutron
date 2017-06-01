package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class BasePrivacyNodeChildProvider {


    @ComponentScope
    public static class CreditCheckFlagNodeRuleProvider implements RuleProvider<CreditCheckFlagNode> {

        @Inject
        public CreditCheckFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCheckFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ThirdPartyDisclosureFlagNodeRuleProvider implements RuleProvider<ThirdPartyDisclosureFlagNode> {

        @Inject
        public ThirdPartyDisclosureFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ThirdPartyDisclosureFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class LegalActionNodeRuleProvider implements RuleProvider<LegalActionNode> {

        @Inject
        public LegalActionNodeRuleProvider() {

        }

        @Override
        public void initializeState(LegalActionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CreditHistoryListNodeRuleProvider implements RuleProvider<CreditHistoryListNode> {

        @Inject
        public CreditHistoryListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditHistoryListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
