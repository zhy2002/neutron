package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BaseOccupationNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseOccupationNodeRuleProvider implements RuleProvider<BaseOccupationNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseOccupationNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseOccupationNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
