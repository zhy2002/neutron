package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@RelatedPartyListNodeScope
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

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
