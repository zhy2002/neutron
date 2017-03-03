package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityLimitAmountNode;


@OtherLiabilityLimitAmountNodeScope
public class OtherLiabilityLimitAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<OtherLiabilityLimitAmountNode> {

    @Inject
    public OtherLiabilityLimitAmountNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityLimitAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
