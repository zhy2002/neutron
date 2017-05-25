package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@TrustSettlorNotRequiredReasonNodeScope
public class TrustSettlorNotRequiredReasonNodeRuleProvider implements RuleProvider<TrustSettlorNotRequiredReasonNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustSettlorNotRequiredReasonNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustSettlorNotRequiredReasonNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
