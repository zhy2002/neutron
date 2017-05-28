package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanTypeNodeScope
public class LoanTypeNodeRuleProvider implements RuleProvider<LoanTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
