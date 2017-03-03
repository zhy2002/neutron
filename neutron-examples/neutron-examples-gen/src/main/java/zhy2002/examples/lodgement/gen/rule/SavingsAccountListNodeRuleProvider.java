package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsAccountListNode;


@SavingsAccountListNodeScope
public class SavingsAccountListNodeRuleProvider
    extends ListUiNodeRuleProvider<SavingsAccountListNode> {

    @Inject
    public SavingsAccountListNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsAccountListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
