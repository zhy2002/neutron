package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityMonthlyRepaymentNode;


@OtherLiabilityMonthlyRepaymentNodeScope
public class OtherLiabilityMonthlyRepaymentNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<OtherLiabilityMonthlyRepaymentNode> {

    @Inject
    public OtherLiabilityMonthlyRepaymentNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityMonthlyRepaymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
