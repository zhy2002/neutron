package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

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
