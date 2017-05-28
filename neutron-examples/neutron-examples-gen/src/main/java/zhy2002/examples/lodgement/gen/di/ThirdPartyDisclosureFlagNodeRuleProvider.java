package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyDisclosureFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyDisclosureFlagNodeScope
public class ThirdPartyDisclosureFlagNodeRuleProvider implements RuleProvider<ThirdPartyDisclosureFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyDisclosureFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyDisclosureFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
