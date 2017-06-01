package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class AdditionalNodeChildProvider {


    @ComponentScope
    public static class AdditionalCommentNodeRuleProvider implements RuleProvider<AdditionalCommentNode> {

        @Inject
        public AdditionalCommentNodeRuleProvider() {

        }

        @Override
        public void initializeState(AdditionalCommentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class RelatedPartyListNodeRuleProvider implements RuleProvider<RelatedPartyListNode> {

        @Inject
        public RelatedPartyListNodeRuleProvider() {

        }

        @Override
        public void initializeState(RelatedPartyListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
