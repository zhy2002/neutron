package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityAmountOwningNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityAmountOwningNodeScope
public class OtherLiabilityAmountOwningNodeRuleProvider implements RuleProvider<OtherLiabilityAmountOwningNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityAmountOwningNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityAmountOwningNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}