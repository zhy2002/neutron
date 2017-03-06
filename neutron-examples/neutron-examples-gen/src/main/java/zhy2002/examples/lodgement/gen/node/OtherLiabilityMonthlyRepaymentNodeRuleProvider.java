package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

        //todo move source to a profile
    }

}
