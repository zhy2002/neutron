package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanClearingFlagNode;


@LoanClearingFlagNodeScope
public class LoanClearingFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<LoanClearingFlagNode> {

    @Inject
    public LoanClearingFlagNodeRuleProvider() {}

    @Override
    public void initializeState(LoanClearingFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
