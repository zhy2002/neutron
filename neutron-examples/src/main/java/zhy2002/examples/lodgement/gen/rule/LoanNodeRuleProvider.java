package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanNode;


@LoanNodeScope
public class LoanNodeRuleProvider
    extends ObjectUiNodeRuleProvider<LoanNode> {

    @Inject
    public LoanNodeRuleProvider() {}

    @Override
    public void initializeState(LoanNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
