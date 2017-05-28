package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityMonthlyRepaymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityMonthlyRepaymentNodeScope
public class OtherLiabilityMonthlyRepaymentNodeRuleProvider implements RuleProvider<OtherLiabilityMonthlyRepaymentNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityMonthlyRepaymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityMonthlyRepaymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
