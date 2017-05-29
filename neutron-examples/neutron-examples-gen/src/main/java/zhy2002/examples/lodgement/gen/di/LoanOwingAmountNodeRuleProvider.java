package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanOwingAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanOwingAmountNodeScope
public class LoanOwingAmountNodeRuleProvider implements RuleProvider<LoanOwingAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanOwingAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanOwingAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}