package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyTitleNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyTitleNodeScope
public class ThirdPartyTitleNodeRuleProvider implements RuleProvider<ThirdPartyTitleNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyTitleNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
