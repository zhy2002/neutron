package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class LiabilitiesNodeChildProvider {


    @ComponentScope
    public static class CreditCardListNodeRuleProvider implements RuleProvider<CreditCardListNode> {

        @Inject
        public CreditCardListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class LoanListNodeRuleProvider implements RuleProvider<LoanListNode> {

        @Inject
        public LoanListNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OtherLiabilityListNodeRuleProvider implements RuleProvider<OtherLiabilityListNode> {

        @Inject
        public OtherLiabilityListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
