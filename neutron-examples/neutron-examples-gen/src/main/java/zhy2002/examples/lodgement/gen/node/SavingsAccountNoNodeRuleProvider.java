package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
