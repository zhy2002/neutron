package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.FeeDescriptionNode;
import zhy2002.examples.lodgement.gen.di.*;

@FeeDescriptionNodeScope
public class FeeDescriptionNodeRuleProvider implements RuleProvider<FeeDescriptionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FeeDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
