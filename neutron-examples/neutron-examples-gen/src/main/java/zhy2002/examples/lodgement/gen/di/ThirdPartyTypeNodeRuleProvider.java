package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyTypeNodeScope
public class ThirdPartyTypeNodeRuleProvider implements RuleProvider<ThirdPartyTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
