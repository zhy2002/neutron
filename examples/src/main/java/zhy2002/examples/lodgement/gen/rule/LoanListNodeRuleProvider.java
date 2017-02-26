package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanListNode;


@LoanListNodeScope
public class LoanListNodeRuleProvider
    extends ListUiNodeRuleProvider<LoanListNode> {

    @Inject
    public LoanListNodeRuleProvider() {}

    @Override
    public void initializeState(LoanListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
