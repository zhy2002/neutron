package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.FeeAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@FeeAmountNodeScope
public class FeeAmountNodeRuleProvider implements RuleProvider<FeeAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public FeeAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
