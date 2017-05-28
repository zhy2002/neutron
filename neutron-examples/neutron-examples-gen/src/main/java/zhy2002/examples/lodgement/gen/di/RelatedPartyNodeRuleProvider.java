package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.RelatedPartyNode;
import zhy2002.examples.lodgement.gen.di.*;

@RelatedPartyNodeScope
public class RelatedPartyNodeRuleProvider implements RuleProvider<RelatedPartyNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RelatedPartyNodeRuleProvider() {
    }

    @Override
    public void initializeState(RelatedPartyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
