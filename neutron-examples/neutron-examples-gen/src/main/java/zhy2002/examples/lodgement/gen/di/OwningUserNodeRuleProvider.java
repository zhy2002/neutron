package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OwningUserNode;
import zhy2002.examples.lodgement.gen.di.*;

@OwningUserNodeScope
public class OwningUserNodeRuleProvider implements RuleProvider<OwningUserNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OwningUserNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwningUserNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}