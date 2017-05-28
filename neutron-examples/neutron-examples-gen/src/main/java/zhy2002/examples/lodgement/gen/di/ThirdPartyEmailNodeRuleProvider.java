package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyEmailNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyEmailNodeScope
public class ThirdPartyEmailNodeRuleProvider implements RuleProvider<ThirdPartyEmailNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyEmailNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
