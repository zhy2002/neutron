package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNoNode;
import zhy2002.examples.lodgement.gen.di.*;

@SavingsAccountNoNodeScope
public class SavingsAccountNoNodeRuleProvider implements RuleProvider<SavingsAccountNoNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsAccountNoNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsAccountNoNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
