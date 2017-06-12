package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.RelatedPartyListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class RelatedPartyListNodeRuleProvider implements RuleProvider<RelatedPartyListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RelatedPartyListNodeRuleProvider() {
    }

    @Override
    public void initializeState(RelatedPartyListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<SetContentNodeToNewItemRule> setContentNodeToNewItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        SetContentNodeToNewItemRule setContentNodeToNewItemRule = setContentNodeToNewItemRuleProvider.get();
        createdRules.add(setContentNodeToNewItemRule);
    }

}
