package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsAccountListNodeScope
public class SavingsAccountListNodeRuleProvider implements RuleProvider<SavingsAccountListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsAccountListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsAccountListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
