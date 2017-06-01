package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class SelectRelatedPersonNodeChildProvider {


    @ComponentScope
    public static class RelatedPersonReferenceNodeRuleProvider implements RuleProvider<RelatedPersonReferenceNode> {

        @Inject
        public RelatedPersonReferenceNodeRuleProvider() {

        }

        @Override
        public void initializeState(RelatedPersonReferenceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class SelectRelatedPersonFlagNodeRuleProvider implements RuleProvider<SelectRelatedPersonFlagNode> {

        @Inject
        public SelectRelatedPersonFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(SelectRelatedPersonFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
