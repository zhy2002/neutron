package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@LenderNodeScope
public class LenderNodeRuleProvider implements RuleProvider<LenderNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LenderNodeRuleProvider() {
    }

    @Override
    public void initializeState(LenderNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
