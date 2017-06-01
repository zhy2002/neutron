package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class SelectAccountHolderNodeChildProvider {


    @ComponentScope
    public static class AccountHolderReferenceNodeRuleProvider implements RuleProvider<AccountHolderReferenceNode> {

        @Inject
        public AccountHolderReferenceNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccountHolderReferenceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class SelectAccountHolderFlagNodeRuleProvider implements RuleProvider<SelectAccountHolderFlagNode> {

        @Inject
        public SelectAccountHolderFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(SelectAccountHolderFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
