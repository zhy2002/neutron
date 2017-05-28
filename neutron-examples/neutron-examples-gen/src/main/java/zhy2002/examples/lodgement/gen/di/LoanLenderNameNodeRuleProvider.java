package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanLenderNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanLenderNameNodeScope
public class LoanLenderNameNodeRuleProvider implements RuleProvider<LoanLenderNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanLenderNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanLenderNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
