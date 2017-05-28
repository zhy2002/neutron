package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.DobNode;
import zhy2002.examples.lodgement.gen.di.*;


public class DobNodeRuleProvider implements RuleProvider<DobNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DobNodeRuleProvider() {
    }

    @Override
    public void initializeState(DobNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
