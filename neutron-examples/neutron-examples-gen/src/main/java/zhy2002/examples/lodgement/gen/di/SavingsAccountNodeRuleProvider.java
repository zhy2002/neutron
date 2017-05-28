package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNode;
import zhy2002.examples.lodgement.gen.di.*;

@SavingsAccountNodeScope
public class SavingsAccountNodeRuleProvider implements RuleProvider<SavingsAccountNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsAccountNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsAccountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
