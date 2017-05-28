package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanClearingFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanClearingFlagNodeScope
public class LoanClearingFlagNodeRuleProvider implements RuleProvider<LoanClearingFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanClearingFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
