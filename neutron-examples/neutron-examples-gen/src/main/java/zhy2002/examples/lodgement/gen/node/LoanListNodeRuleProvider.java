package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@LoanListNodeScope
public class LoanListNodeRuleProvider implements RuleProvider<LoanListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanListNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
