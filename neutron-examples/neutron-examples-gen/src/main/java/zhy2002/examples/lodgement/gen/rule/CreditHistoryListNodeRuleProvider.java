package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditHistoryListNode;


@CreditHistoryListNodeScope
public class CreditHistoryListNodeRuleProvider
    extends ListUiNodeRuleProvider<CreditHistoryListNode> {

    @Inject
    public CreditHistoryListNodeRuleProvider() {}

    @Override
    public void initializeState(CreditHistoryListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
