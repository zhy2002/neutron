package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MortgageLimitAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@MortgageLimitAmountNodeScope
public class MortgageLimitAmountNodeRuleProvider implements RuleProvider<MortgageLimitAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLimitAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
