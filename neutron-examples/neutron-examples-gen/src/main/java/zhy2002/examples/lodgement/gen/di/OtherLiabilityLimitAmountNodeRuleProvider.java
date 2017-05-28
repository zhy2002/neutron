package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityLimitAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityLimitAmountNodeScope
public class OtherLiabilityLimitAmountNodeRuleProvider implements RuleProvider<OtherLiabilityLimitAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityLimitAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
