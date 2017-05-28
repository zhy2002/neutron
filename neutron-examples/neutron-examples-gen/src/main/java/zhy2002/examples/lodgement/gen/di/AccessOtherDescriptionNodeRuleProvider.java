package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessOtherDescriptionNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessOtherDescriptionNodeScope
public class AccessOtherDescriptionNodeRuleProvider implements RuleProvider<AccessOtherDescriptionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessOtherDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessOtherDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
